import sys
from antlr4 import *
from UNMLLexer import UNMLLexer
from UNMLParser import UNMLParser
from UNMLVisitor import UNMLVisitor

globalDic = {}
simplexDic = {'objFun':[],'rest':[],'typeM':[]}
numIdVar = 0
class EvalVisitor(UNMLVisitor):
	global globalDic
	global simplexDic
	global numIdVar
	
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
		global globalDic
		global numIdVar
		if ctx.PARAMETER() != None:
			aux = ctx.ID().getText()
			globalDic[str(aux)]= None
			if ctx.ALLOCATE() != None:
				val = self.visit(ctx.numeric_literal())

				globalDic[ctx.ID().getText()] = val
		else:
			aux = ctx.VAR_ID().getText()
			numIdVar 
			globalDic[str(aux)]=
			#print ctx.VAR_ID().getText()
		
		return None


	# Visit a parse tree produced by UNMLParser#inequation_operator.
	def visitInequation_operator(self, ctx):
		return ctx.getText()


	# Visit a parse tree produced by UNMLParser#numeric_literal.
	def visitNumeric_literal(self, ctx):
		if ctx.numeric_unsing() != None:
			num = self.visit(ctx.numeric_unsing())
			if ctx.OP != None and ctx.OP == '-':
				return num*-1
			else:
					return num
		else:
			return ctx.ID().getText()


	# Visit a parse tree produced by UNMLParser#numeric_unsing.
	def visitNumeric_unsing(self, ctx):
			if ctx.INTEGER() != None:
				#print ctx.INTEGER().getText()
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
		res,val=visit(ctx.lineal_expression())
		if res:
			aux = ctx.ID()
			globalDic[str(aux)]=[]
			aux1 = ctx.lineal_expression().getText()
			globalDic[str(aux)].append(str(aux1))
			aux2 = ctx.type_objective().getText()
			globalDic[str(aux)].append(str(aux2))
			simplexDic['typeM'].append(str(aux2))

		print globalDic
		print simplexDic
		return None


	# Visit a parse tree produced by UNMLParser#constrain_statement.
	def visitConstrain_statement(self, ctx):
		return self.visitChildren(ctx)


	# Visit a parse tree produced by UNMLParser#type_objective.
	def visitType_objective(self, ctx):
		if ctx.MAXIMIZE() != None:
			return ctx.MAXIMIZE().getText()
		elif ctx.MINIMIZE() != None:
			return ctx.MINIMIZE.getText()
		return None

	# Visit a parse tree produced by UNMLParser#short_lineal_exp.
	def visitShort_lineal_exp(self, ctx):
		if globalDic.has_key( ctx.VAR_ID()):
			if ctx.numeric_literal() != None:
				return True, self.visit(ctx.numeric_literal())
			elif ctx.numeric_operation() != None:
				return True, self.visit(ctx.numeric_operation())
			else:
				return True, 1
		else:
			return False, 0

	# Visit a parse tree produced by UNMLParser#lineal_expression.
	def visitLineal_expression(self, ctx):
		return self.visitChildren(ctx)



	# Visit a parse tree produced by UNMLParser#numeric_operation.
	def visitNumeric_operation(self, ctx):
		ans = 0
		op = self.visit(aritmetic_operator)
		if op == '+':
			ans = self.visit(ctx.numeric_literal(0)) + self.visit(ctx.numeric_literal(1))
		elif op == '-':
			ans = self.visit(ctx.numeric_literal(0)) - self.visit(ctx.numeric_literal(1)):
		elif op == '*':
			ans = floatself.visit(ctx.numeric_literal(0)) * self.visit(ctx.numeric_literal(1)):
		elif op == '/':
			ans = float(self.visit(ctx.numeric_literal(0))) / float(self.visit(ctx.numeric_literal(1))):
		elif op == '%':
			ans = self.visit(ctx.numeric_literal(0)) % self.visit(ctx.numeric_literal(1)):
		return None

	# Visit a parse tree produced by UNMLParser#lineal_operator.
	def visitLineal_operator(self, ctx):
		if ctx.ADD() != None:
			return ctx.ADD().getText()
		elif ctx.MINUS() != None:
			return ctx.MINUS().getText()
		return None


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
		return None
