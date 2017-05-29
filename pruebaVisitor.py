# Generated from prueba.g4 by ANTLR 4.5.1
from antlr4 import *

# This class defines a complete generic visitor for a parse tree produced by pruebaParser.

class pruebaVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by pruebaParser#list_of_ids.
    def visitList_of_ids(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pruebaParser#simple_exp.
    def visitSimple_exp(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pruebaParser#expression.
    def visitExpression(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pruebaParser#variable.
    def visitVariable(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pruebaParser#term.
    def visitTerm(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pruebaParser#factor.
    def visitFactor(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pruebaParser#param_list.
    def visitParam_list(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pruebaParser#set.
    def visitSet(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pruebaParser#type.
    def visitType(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pruebaParser#bloq.
    def visitBloq(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pruebaParser#propot_sec.
    def visitPropot_sec(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pruebaParser#propot.
    def visitPropot(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pruebaParser#asigNum.
    def visitAsigNum(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pruebaParser#asigVec.
    def visitAsigVec(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pruebaParser#if_sent.
    def visitIf_sent(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pruebaParser#cond_bloq.
    def visitCond_bloq(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pruebaParser#while_sent.
    def visitWhile_sent(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pruebaParser#do_while_sent.
    def visitDo_while_sent(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pruebaParser#seleccionar_senten.
    def visitSeleccionar_senten(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pruebaParser#casosGen.
    def visitCasosGen(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pruebaParser#casosDef.
    def visitCasosDef(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pruebaParser#for.
    def visitFor(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pruebaParser#funct_sent.
    def visitFunct_sent(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pruebaParser#proc_sent.
    def visitProc_sent(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pruebaParser#funcion.
    def visitFuncion(self, ctx):
        return self.visitChildren(ctx)


