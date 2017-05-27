// Generated from prueba.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link pruebaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface pruebaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link pruebaParser#list_of_ids}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_ids(pruebaParser.List_of_idsContext ctx);
	/**
	 * Visit a parse tree produced by {@link pruebaParser#simple_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_exp(pruebaParser.Simple_expContext ctx);
	/**
	 * Visit a parse tree produced by {@link pruebaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(pruebaParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link pruebaParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(pruebaParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link pruebaParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(pruebaParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link pruebaParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(pruebaParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link pruebaParser#param_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_list(pruebaParser.Param_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link pruebaParser#set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet(pruebaParser.SetContext ctx);
	/**
	 * Visit a parse tree produced by {@link pruebaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(pruebaParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link pruebaParser#bloq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloq(pruebaParser.BloqContext ctx);
	/**
	 * Visit a parse tree produced by {@link pruebaParser#propot_sec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropot_sec(pruebaParser.Propot_secContext ctx);
	/**
	 * Visit a parse tree produced by {@link pruebaParser#propot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropot(pruebaParser.PropotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code asigNum}
	 * labeled alternative in {@link pruebaParser#assigment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsigNum(pruebaParser.AsigNumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code asigVec}
	 * labeled alternative in {@link pruebaParser#assigment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsigVec(pruebaParser.AsigVecContext ctx);
	/**
	 * Visit a parse tree produced by {@link pruebaParser#if_sent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_sent(pruebaParser.If_sentContext ctx);
	/**
	 * Visit a parse tree produced by {@link pruebaParser#cond_bloq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_bloq(pruebaParser.Cond_bloqContext ctx);
	/**
	 * Visit a parse tree produced by {@link pruebaParser#while_sent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_sent(pruebaParser.While_sentContext ctx);
	/**
	 * Visit a parse tree produced by {@link pruebaParser#do_while_sent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_while_sent(pruebaParser.Do_while_sentContext ctx);
	/**
	 * Visit a parse tree produced by {@link pruebaParser#seleccionar_senten}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeleccionar_senten(pruebaParser.Seleccionar_sentenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code casosGen}
	 * labeled alternative in {@link pruebaParser#casos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCasosGen(pruebaParser.CasosGenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code casosDef}
	 * labeled alternative in {@link pruebaParser#casos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCasosDef(pruebaParser.CasosDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link pruebaParser#for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(pruebaParser.ForContext ctx);
	/**
	 * Visit a parse tree produced by {@link pruebaParser#funct_sent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunct_sent(pruebaParser.Funct_sentContext ctx);
	/**
	 * Visit a parse tree produced by {@link pruebaParser#proc_sent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProc_sent(pruebaParser.Proc_sentContext ctx);
	/**
	 * Visit a parse tree produced by {@link pruebaParser#funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncion(pruebaParser.FuncionContext ctx);
}