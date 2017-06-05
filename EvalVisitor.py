import sys
from antlr4 import *
from UNMLLexer import UNMLLexer
from UNMLParser import UNMLParser
from UNMLVisitor import UNMLVisitor

globalDic = {}

class EvalVisitor(UNMLVisitor):
	global globalDic
	
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
		print globalDic
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
				return int(num*-1)
			else:
					return int(num)
		else:
			return ctx.ID().getText()


	# Visit a parse tree produced by UNMLParser#numeric_unsing.
	def visitNumeric_unsing(self, ctx):
			if ctx.INTEGER() != None:
				#print ctx.INTEGER().getText()
				return ctx.INTEGER().getText()
			else:
				return ctx.REAL()

	# Visit a parse tree produced by UNMLParser#building_block.
	def visitBuilding_block(self, ctx):
		return self.visitChildren(ctx)
"""
    # Visit a parse tree produced by UNMLParser#option.
    def visitOption(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by UNMLParser#building_block.
    def visitBuilding_block(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by UNMLParser#function_statement.
    def visitFunction_statement(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by UNMLParser#constrain_statement.
    def visitConstrain_statement(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by UNMLParser#type_objective.
    def visitType_objective(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by UNMLParser#lineal_expression.
    def visitLineal_expression(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by UNMLParser#lineal_operator.
    def visitLineal_operator(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by UNMLParser#aritmetic_operator.
    def visitAritmetic_operator(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by UNMLParser#numeric_expression.
    def visitNumeric_expression(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by UNMLParser#aritmetic_expression.
    def visitAritmetic_expression(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by UNMLParser#logical_expression.
    def visitLogical_expression(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by UNMLParser#subscripted_parameters.
    def visitSubscripted_parameters(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by UNMLParser#function_reference.
    def visitFunction_reference(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by UNMLParser#conditional_expression.
    def visitConditional_expression(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by UNMLParser#list_of_ids.
    def visitList_of_ids(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by UNMLParser#logic_operator.
    def visitLogic_operator(self, ctx):
        return self.visitChildren(ctx)
        """