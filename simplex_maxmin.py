import cvxopt

#def simplex_max:
A = cvxopt.matrix([[-1., -2., 1., 0.], # columna de x1
            [-1.5, -1., 0., 1.]]) # columna de x2
b = cvxopt.matrix([750., 1000., 0., 0.]) # resultados
c = cvxopt.matrix([50., 40.]) # funcion objetivo

# resolviendo el problema
sol=cvxopt.solvers.lp(c,A,b)
#print('{0:.2f}, {1:.2f}'.format(sol['x'][0]*-1, sol['x'][1]*-1))
print(sol['x']*-1)


from cvxopt import matrix, solvers
c = matrix([-4., -5.])
A = matrix([[2., 1., -1., 0.], [1., 2., 0., -1.]])
b = matrix([3., 3., 0., 0.])
sol = solvers.lp(c, G, h)
print(sol['x'])