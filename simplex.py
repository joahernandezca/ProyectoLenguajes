from pymprog import *  # Importar el modulo
# indices y datos
xid, rid = range(3), range(3)
c = (10.0, 6.0, 4.0)
mat = [ (1.0, 1.0, 1.0),
        (10.0, 4.0, 5.0),
        (2.0, 2.0, 6.0)]
b = (100.0, 600.0, 300.0)
#definicion del problema
beginModel('basic')   #Lo definimos como basico
verbose(True)
x = var(xid, 'X') #crear variables
maximize( #funcion objetivo
  sum(c[i]*x[i] for i in xid), 'miobjetivo'
)
r=st( #Conjunto de restricciones
  sum(x[j]*mat[i][j] for j in xid) &lt;= b[i] for i in rid
)
solve() #Solucion e Informe
print &quot;Estado Solucionador:&quot;, status()
print 'Z = %g;' % vobj()  # Valor funcion Objetivo
#Impresion de nombre de las variables y las primales
print ';\n'.join('%s = %g {dual: %g}' % (
   x[i].name, x[i].primal, x[i].dual)
                    for i in xid)
print ';\n'.join('%s = %g {dual: %g}' % (
   r[i].name, r[i].primal, r[i].dual)
                    for i in rid)
 
print reportKKT()
print &quot;Environment:&quot;, env
for pn in dir(env):
    if pn[:2]=='__'==pn[-2:]: continue
    print pn, getattr(env, pn)
 
print ' '
print evaluate(sum(x[i]*(i+x[i])**2 for i in xid))
print sum(x[i].primal*(i+x[i].primal)**2 for i in xid)
endModel() #Finalizar el Modelo