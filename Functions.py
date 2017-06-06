import sys
from cvxopt import matrix, solvers

simplexDic = {'objFun': [[10., 3.], [0.8, 1.3]],
              'rest': [[[1., 1., 130., '<'], [2.5, 1., 250., '<']], [[1., 1., 130., '<'], [2.5, 1., 250., '<']]],
              'typeM': ['maximize', 'maximize']}

simplexDic2 = {'objFun': [[-10., 3.], [-1., 3.]],
               'rest': [[[-3., 3., 817., '>'], [7., 0., 20., '>']], [[-1., -1., 817., '>'], [10., 4., -60., '=']]],
               'typeM': ['minimize', 'maximize']}
"""
rest= [[1., 1., 130.,'<'],[2.5, 1.,250.,'<'],[10., 3.,695.,'>']]
funObj = [-10., -3.] # funcion objetivo
funObj2 = [0.8, 1.3] # funcion objetivo
typeMax='MAXIMIZE'
typeMin='MINIMIZE'
"""
"""
Dictionary:
  objFun            : 0 1 2 ... n
  const(rest)       : 0 1 2 ... n
  typeM             : 0 1 2 ... n
"""


def simplex(objFun, const, typeM):
    var = len(objFun)
    numRes = len(const)
    cols = []
    resultCols = []
    mm = 1
    if (typeM == 'maximize'):
        mm = -1

    for i in xrange(var):
        cols.append([])
        objFun[i] = objFun[i] * mm
        for j in xrange(numRes):
            if (const[j][var + 1] == '<'):
                cols[i].append(const[j][i])
            elif (const[j][var + 1] == '>'):
                cols[i].append(const[j][i] * -1)
            elif (const[j][var + 1] == '='):
                cols[i].append(const[j][i])
                cols[i].append(const[j][i] * -1)

        for j in xrange(var):
            if (len(cols) == j + 1):
                cols[i].append(-1)
            else:
                cols[i].append(0)
    for k in xrange(numRes):
        if (const[k][var + 1] == '<'):
            resultCols.append(const[k][var])
        elif (const[k][var + 1] == '>'):
            resultCols.append(const[k][var] * -1)
        elif (const[j][var + 1] == '='):
            resultCols.append(const[k][var])
            resultCols.append(const[k][var] * -1)

    for k in xrange(var):
        resultCols.append(0)

    solv = []
    sol = solvers.lp(matrix(objFun), matrix(cols), matrix(resultCols))
    if (str(sol['x']) != "None"):
        for l in xrange(var):
            solv.append(float(sol['x'][l]))
            objFun[l] = objFun[l] * mm

    # print typeM
    # print cols
    # print resultCols
    # print objFun
    # print len(solv)
    # print solv[0]
    # print solv[1]
    print (solv)
    return solv


"""
print simplex(funObj,rest,typeMin)
print simplex(funObj2,rest,typeMax)
"""


def cohon(aObjFun, matrixConst, aTypeM):
    r = 5
    numObjFun = len(aObjFun)
    numVar = len(aObjFun[0])
    solObjFun = []
    matSolObj = []
    E = []
    maxMin = []
    solCoh = []
    for i in xrange(numObjFun):
        tmp = simplex(aObjFun[i], matrixConst[i], aTypeM[i])
        solObjFun.append(tmp)
        if (len(tmp) == 0):
            print ('No simplex solution ' + str(i + 1))
            print ('Cohon can not execute')
            sys.exit()

    print aObjFun
    print solObjFun
    print matSolObj

    for i in xrange(numObjFun):
        matSolObj.append([])
        for j in xrange(numObjFun):
            tmp = 0
            for k in xrange(numVar):
                tmp = tmp + aObjFun[i][k] * solObjFun[j][k]
            matSolObj[i].append(tmp)

    for i in xrange(numObjFun):
        maxMin.append([max(matSolObj[i]), min(matSolObj[i])])

    print maxMin

    for i in xrange(numObjFun):
        E.append([])
        for j in xrange(r):
            E[i].append((maxMin[i][1] + ((float(j) / float(r - 1)) * (maxMin[i][0] - maxMin[i][1]))))

    print E
    for i in xrange(numObjFun):
        solCoh.append([])
        for j in xrange(numObjFun):
            if (i != j):
                for k in xrange(r):
                    solCoh[i].append(simplex(aObjFun[i], matrixConst[i] + [aObjFun[j] + [E[j][k], '>']], 'maximize'))
    print solCoh


"""cohon(simplexDic['objFun'],simplexDic['rest'],simplexDic['typeM'])
  """


def run(Dictionary):
    cohon(Dictionary['objFun'], Dictionary['rest'], Dictionary['typeM'])

# run(simplexDic2)



