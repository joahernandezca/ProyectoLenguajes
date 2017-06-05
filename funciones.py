import sys
from cvxopt import matrix, solvers

rest = [[1., 1., 400., '>'], [1., 2., 580., '='], [1., 0., 300., '=']]
funObj = [1., 1.4]  # funcion objetivo
typeMax = 'maximizacion'
typeMin = 'minimuzacion'

"""  
Recibimos

Diccionario:
  objFun            : 0 1 2 ... n
  rest              : 0 1 2 ... n
  typeM              : 0 1 2 ... n


"""


def simplex(objetivo, restricciones, tipo):
    var = len(objetivo)
    numRes = len(restricciones)
    cols = []
    resulCols = []
    mm = 1
    if (tipo == 'maximizacion'):
        mm = -1

    for i in xrange(var):
        cols.append([])
        objetivo[i] = objetivo[i] * mm * -1
        for j in xrange(numRes):
            cols[i].append(restricciones[j][i] * mm)

        for j in xrange(var):
            if (len(cols) == j + 1):
                cols[i].append(-1 * mm)
            else:
                cols[i].append(0)
    for k in xrange(numRes):
        resulCols.append(restricciones[k][var])
    for k in xrange(var):
        resulCols.append(0)

    sol = solvers.lp(matrix(objetivo), matrix(cols), matrix(resulCols))

    print cols
    print resulCols
    print objetivo
    print (sol['x'] * mm)


simplex(funObj, rest, typeMax)