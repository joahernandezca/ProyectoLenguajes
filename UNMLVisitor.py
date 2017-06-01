# Generated from UNML.g4 by ANTLR 4.7
from antlr4 import *

# This class defines a complete generic visitor for a parse tree produced by UNMLParser.

class UNMLVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by UNMLParser#model.
    def visitModel(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by UNMLParser#list_of_ids.
    def visitList_of_ids(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by UNMLParser#simple_exp.
    def visitSimple_exp(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by UNMLParser#expression.
    def visitExpression(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by UNMLParser#variable.
    def visitVariable(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by UNMLParser#term.
    def visitTerm(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by UNMLParser#factor.
    def visitFactor(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by UNMLParser#param_list.
    def visitParam_list(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by UNMLParser#set.
    def visitSet(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by UNMLParser#type.
    def visitType(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by UNMLParser#bloq.
    def visitBloq(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by UNMLParser#propot_sec.
    def visitPropot_sec(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by UNMLParser#propot.
    def visitPropot(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by UNMLParser#asigNum.
    def visitAsigNum(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by UNMLParser#asigVec.
    def visitAsigVec(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by UNMLParser#parameter_assigment.
    def visitParameter_assigment(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by UNMLParser#if_sent.
    def visitIf_sent(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by UNMLParser#cond_bloq.
    def visitCond_bloq(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by UNMLParser#while_sent.
    def visitWhile_sent(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by UNMLParser#do_while_sent.
    def visitDo_while_sent(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by UNMLParser#for.
    def visitFor(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by UNMLParser#function.
    def visitFunction(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by UNMLParser#minimize.
    def visitMinimize(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by UNMLParser#maximize.
    def visitMaximize(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by UNMLParser#restriction.
    def visitRestriction(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by UNMLParser#var.
    def visitVar(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by UNMLParser#param.
    def visitParam(self, ctx):
        return self.visitChildren(ctx)


