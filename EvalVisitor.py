import sys
from antlr4 import *
from UNMLLexer import UNMLLexer
from UNMLParser import UNMLParser
from UNMLVisitor import UNMLVisitor
from collections import deque
import sys, traceback
import sys
from cvxopt import matrix, solvers
from Functions import Functions

globalDic = {} #Todas las variables (Singleton)
var_index = 0 #
simplexDic = {'objFun':[],'rest':[],'typeM':[]}



class EvalVisitor(UNMLVisitor):
	global globalDic
	global simplexDic
	
	# Visit a parse tree produced by UNMLParser#compilationUnit.
	def visitCompilationUnit(self, ctx):
		return self.visit(ctx.block())


	# Visit a parse tree produced by UNMLParser#block.
	def visitBlock(self, ctx):
		for x in xrange(ctx.getChildCount()):
			self.visit(ctx.getChild(x))
		return None

	# Visit a parse tree produced by UNMLParser#propositions_sequence.
	def visitPropositions_sequence(self, ctx):
		for x in xrange(ctx.getChildCount()):
			self.visit(ctx.getChild(x))
		return None

	# Visit a parse tree produced by UNMLParser#proposition.
	def visitProposition(self, ctx):
		for x in xrange(ctx.getChildCount()):
			self.visit(ctx.getChild(x))
		return None

	# Visit a parse tree produced by UNMLParser#assign_statement.
	def visitAssign_statement(self, ctx):
		global globalDic, var_index, simplexDic
		if ctx.PARAMETER() != None:
			aux = ctx.ID().getText()
			globalDic[str(aux)]= None
			if ctx.ALLOCATE() != None:
				val = self.visit(ctx.numeric_literal())

				globalDic[ctx.ID().getText()] = val
		else:
			aux = ctx.VAR_ID().getText()
			if not(globalDic.has_key(aux)):
				globalDic[str(aux)] = var_index
				var_index += 1		
		return None


	# Visit a parse tree produced by UNMLParser#inequation_operator.
	def visitInequation_operator(self, ctx):
		if ctx.GREATER_THAN() != None:
			return ctx.GREATER_THAN().getText()
		elif ctx.MINOR_THAN() != None:
			return ctx.MINOR_THAN().getText()
		else:
			return ctx.ASSING().getText()


	# Visit a parse tree produced by UNMLParser#numeric_literal.
	def visitNumeric_literal(self, ctx):
		if ctx.numeric_unsing() != None:
			num = self.visit(ctx.numeric_unsing())
			if ctx.OP != None and ctx.OP.text == '-':
				return num*-1
			else:
				return num
		else:
			return ctx.ID().getText()


	# Visit a parse tree produced by UNMLParser#numeric_unsing.
	def visitNumeric_unsing(self, ctx):
			if ctx.INTEGER() != None:
				return int(ctx.INTEGER().getText())
			else:
				return float(ctx.REAL().getText())

	# Visit a parse tree produced by UNMLParser#building_block.
	def visitBuilding_block(self, ctx):
		for x in xrange(ctx.getChildCount()):
			self.visit(ctx.getChild(x))
		return None

	# Visit a parse tree produced by UNMLParser#function_statement.
	def visitFunction_statement(self, ctx):
		global globalDic
		global simplexDic
		a = self.visit(ctx.lineal_expression())
		aux = ctx.ID()
		globalDic[str(aux)]=[]
		aux1 = ctx.lineal_expression().getText()
		globalDic[str(aux)].append(str(aux1))
		aux2 = ctx.type_objective().getText()
		globalDic[str(aux)].append(str(aux2))
		simplexDic['typeM'].append(str(aux2))
		simplexDic['objFun'].append([])
		for i in xrange(var_index):
			simplexDic['objFun'][len(simplexDic['objFun']) - 1].append(0)
		for x in xrange(len(a)/2):
			n = globalDic[a[(x*2) + 1]]
			simplexDic['objFun'][len(simplexDic['objFun']) - 1][n] = a[x*2]
		simplexDic['rest'].append([])
		#print 'global',globalDic
		#print 'simplex', simplexDic
		return None


	# Visit a parse tree produced by UNMLParser#constrain_statement.
	def visitConstrain_statement(self, ctx):
		global globalDic
		global simplexDic
		a = self.visit(ctx.lineal_expression())
		aux = ctx.ID()
		globalDic[str(aux)]=[]
		aux1 = ctx.lineal_expression().getText()
		globalDic[str(aux)].append(str(aux1))
		aux2 = self.visit(ctx.numeric_literal())
		#print aux2
		aux3 = self.visit(ctx.inequation_operator())
		globalDic[str(aux)].append(str(aux2))
		globalDic[str(aux)].append(str(aux3))
		if str(aux3) == '>=':
			aux3 = '>'
		elif str(aux3) == '<=':
			aux3 = '<'
		simplexDic['rest'][len(simplexDic['rest']) - 1].append([])
		#print len(simplexDic['rest'][len(simplexDic['rest']) - 1][len(simplexDic['rest'][len(simplexDic['rest']) - 1])-1])
		#print simplexDic
		for i in xrange(var_index):
			simplexDic['rest'][len(simplexDic['rest']) - 1][len(simplexDic['rest'][len(simplexDic['rest']) - 1])-1].append(0)
		for x in xrange(len(a)/2):
			n = globalDic[a[(x*2) + 1]]
			simplexDic['rest'][len(simplexDic['rest']) - 1][len(simplexDic['rest'][len(simplexDic['rest']) - 1])-1][n] = a[x*2]
		simplexDic['rest'][len(simplexDic['rest']) - 1][len(simplexDic['rest'][len(simplexDic['rest']) - 1])-1].append(str(aux2))
		simplexDic['rest'][len(simplexDic['rest']) - 1][len(simplexDic['rest'][len(simplexDic['rest']) - 1])-1].append(str(aux3))
		#print 'global',globalDic
		
		return None

	# Visit a parse tree produced by UNMLParser#type_objective.
	def visitType_objective(self, ctx):
		if ctx.MAXIMIZE() != None:
			return ctx.MAXIMIZE().getText()
		elif ctx.MINIMIZE() != None:
			return ctx.MINIMIZE.getText()
		return None

	# Visit a parse tree produced by UNMLParser#short_lineal_exp.
	def visitShort_lineal_exp(self, ctx):
		d = []
		if globalDic.has_key( str(ctx.VAR_ID().getText())):
			if ctx.numeric_literal() != None:
				d.append(True)
				d.append(self.visit(ctx.numeric_literal()))
				d.append(str(ctx.VAR_ID().getText()))
				return d
			elif ctx.numeric_operation(0) != None:
				d.append(True)
				d.append(self.visit(ctx.numeric_operation(0)))
				d.append(str(ctx.VAR_ID().getText()))
				return d
			else:
				d.append(True)
				d.append(1)
				d.append(str(ctx.VAR_ID().getText()))
				return d
		else:
			d.append(False)
			return d

	# Visit a parse tree produced by UNMLParser#lineal_expression.
	def visitLineal_expression(self, ctx):
		d = []
		s = 0
		for x in xrange(ctx.getChildCount()):
			a = self.visit(ctx.getChild(x))
			if type(a) == type(d):
				if a[0] and s == 0:
					d.append(a[1])
					d.append(a[2])
				elif a[0] and s == 1:
					d.append(-a[1])
					d.append(a[2])
					s = 0
				else:
					print('La expresion variable ' + ctx.getChild(x).getText() + 'No esta declarada')
					sys.exit(0)
			else:
				if str(a) == '-':
					s = 1
		#print d
		return d



	# Visit a parse tree produced by UNMLParser#numeric_operation.
	def visitNumeric_operation(self, ctx):
		ans = 0.0
		#print ctx.getText()
		# if ctx.LF_PAREN() != None:
		# 	ans = self.visit(ctx.numeric_operation(0)) + ans
		if ctx.numeric_operation() != None:
			print len(ctx.numeric_operation()), 'len'
			if len(ctx.numeric_operation()) > 0:
				for i in xrange(len(ctx.numeric_operation())):
					ans = ans + self.visit(ctx.numeric_operation(i))
			else:
				print 'nose'
				op = self.visit(ctx.aritmetic_operator(0))
				if op == '+':
					ans = float(self.visit(ctx.numeric_literal(0))) + float(self.visit(ctx.numeric_literal(1)))
				elif op == '-':
					ans = float(self.visit(ctx.numeric_literal(0))) - float(self.visit(ctx.numeric_literal(1)))
				elif op == '*':
					ans = float(self.visit(ctx.numeric_literal(0))) * float(self.visit(ctx.numeric_literal(1)))
				elif op == '/':
					ans = float(self.visit(ctx.numeric_literal(0))) / float(self.visit(ctx.numeric_literal(1)))
				elif op == '%':
					ans = float(self.visit(ctx.numeric_literal(0))) % float(self.visit(ctx.numeric_literal(1)))
				print ans, 'ans'
			print len(ctx.aritmetic_operator()), 'OP'
		return ans

	# Visit a parse tree produced by UNMLParser#lineal_operator.
	def visitLineal_operator(self, ctx):
		if ctx.ADD() != None:
			return ctx.ADD().getText()
		elif ctx.MINUS() != None:
			return ctx.MINUS().getText()

	# Visit a parse tree produced by UNMLParser#aritmetic_operator.
	def visitAritmetic_operator(self, ctx):
		if ctx.ADD() != None:
			return ctx.ADD().getText()
		elif ctx.MINUS() != None:
			return ctx.MINUS().getText()
		elif ctx.MULT() != None:
			return ctx.MULT().getText()
		elif ctx.DIV() != None:
			return ctx.DIV().getText()
		elif ctx.MOD() != None:
			return ctx.MOD().getText()
		elif ctx.EXP() != None:
			return ctx.EXP().getText()

	# Visit a parse tree produced by UNMLParser#prop_solve.
	def visitProp_solve(self, ctx):
		global globalDic, simplexDic
		dic = simplexDic
		print 'Diccionario para Simplex',simplexDic
		sol = Functions()
		sol.run(dic)
		return None

	
