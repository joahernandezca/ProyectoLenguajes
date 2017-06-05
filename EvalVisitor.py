import sys
from antlr4 import *
from UNMLLexer import UNMLLexer
from UNMLParser import UNMLParser
from UNMLVisitor import UNMLVisitor

globalDic = {}
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
		global globalDic
		if ctx.PARAMETER() != None:
			aux = ctx.ID().getText()
			globalDic[str(aux)]= None
			if ctx.ALLOCATE() != None:
				val = self.visit(ctx.numeric_literal())

				globalDic[ctx.ID().getText()] = val
		else:
			aux = ctx.VAR_ID().getText()
			globalDic[str(aux)]=str(aux)
			#print ctx.VAR_ID().getText()
		
		# for i in globalDic:
		# 	print i
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
		return self.visitChildren(ctx)


	# Visit a parse tree produced by UNMLParser#short_lineal_exp.
	def visitShort_lineal_exp(self, ctx):
		if globalDic.has_key( ctx.VAR_ID()):
			if ctx.numeric_literal() != None:
				if ctx.aritmetic_operator() != None:
					print len(ctx.aritmetic_operator())
					self.visit(ctx.aritmetic_operator())

				return True, self.visit(ctx.numeric_literal())
			else:
				return True, 1
		else:
			return False, 0

	# Visit a parse tree produced by UNMLParser#lineal_operator.
	def visitLineal_operator(self, ctx):
		return None


	# Visit a parse tree produced by UNMLParser#aritmetic_operator.
	def visitAritmetic_operator(self, ctx):
		print ctx.getText()
		return ctx.getText()
