// Generated from prueba.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link pruebaParser}.
 */
public interface pruebaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link pruebaParser#list_of_ids}.
	 * @param ctx the parse tree
	 */
	void enterList_of_ids(pruebaParser.List_of_idsContext ctx);
	/**
	 * Exit a parse tree produced by {@link pruebaParser#list_of_ids}.
	 * @param ctx the parse tree
	 */
	void exitList_of_ids(pruebaParser.List_of_idsContext ctx);
	/**
	 * Enter a parse tree produced by {@link pruebaParser#simple_exp}.
	 * @param ctx the parse tree
	 */
	void enterSimple_exp(pruebaParser.Simple_expContext ctx);
	/**
	 * Exit a parse tree produced by {@link pruebaParser#simple_exp}.
	 * @param ctx the parse tree
	 */
	void exitSimple_exp(pruebaParser.Simple_expContext ctx);
	/**
	 * Enter a parse tree produced by {@link pruebaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(pruebaParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link pruebaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(pruebaParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link pruebaParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(pruebaParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link pruebaParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(pruebaParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link pruebaParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(pruebaParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link pruebaParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(pruebaParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link pruebaParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(pruebaParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link pruebaParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(pruebaParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link pruebaParser#param_list}.
	 * @param ctx the parse tree
	 */
	void enterParam_list(pruebaParser.Param_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link pruebaParser#param_list}.
	 * @param ctx the parse tree
	 */
	void exitParam_list(pruebaParser.Param_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link pruebaParser#set}.
	 * @param ctx the parse tree
	 */
	void enterSet(pruebaParser.SetContext ctx);
	/**
	 * Exit a parse tree produced by {@link pruebaParser#set}.
	 * @param ctx the parse tree
	 */
	void exitSet(pruebaParser.SetContext ctx);
	/**
	 * Enter a parse tree produced by {@link pruebaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(pruebaParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link pruebaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(pruebaParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link pruebaParser#bloq}.
	 * @param ctx the parse tree
	 */
	void enterBloq(pruebaParser.BloqContext ctx);
	/**
	 * Exit a parse tree produced by {@link pruebaParser#bloq}.
	 * @param ctx the parse tree
	 */
	void exitBloq(pruebaParser.BloqContext ctx);
	/**
	 * Enter a parse tree produced by {@link pruebaParser#propot_sec}.
	 * @param ctx the parse tree
	 */
	void enterPropot_sec(pruebaParser.Propot_secContext ctx);
	/**
	 * Exit a parse tree produced by {@link pruebaParser#propot_sec}.
	 * @param ctx the parse tree
	 */
	void exitPropot_sec(pruebaParser.Propot_secContext ctx);
	/**
	 * Enter a parse tree produced by {@link pruebaParser#propot}.
	 * @param ctx the parse tree
	 */
	void enterPropot(pruebaParser.PropotContext ctx);
	/**
	 * Exit a parse tree produced by {@link pruebaParser#propot}.
	 * @param ctx the parse tree
	 */
	void exitPropot(pruebaParser.PropotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code asigNum}
	 * labeled alternative in {@link pruebaParser#assigment}.
	 * @param ctx the parse tree
	 */
	void enterAsigNum(pruebaParser.AsigNumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code asigNum}
	 * labeled alternative in {@link pruebaParser#assigment}.
	 * @param ctx the parse tree
	 */
	void exitAsigNum(pruebaParser.AsigNumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code asigVec}
	 * labeled alternative in {@link pruebaParser#assigment}.
	 * @param ctx the parse tree
	 */
	void enterAsigVec(pruebaParser.AsigVecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code asigVec}
	 * labeled alternative in {@link pruebaParser#assigment}.
	 * @param ctx the parse tree
	 */
	void exitAsigVec(pruebaParser.AsigVecContext ctx);
	/**
	 * Enter a parse tree produced by {@link pruebaParser#if_sent}.
	 * @param ctx the parse tree
	 */
	void enterIf_sent(pruebaParser.If_sentContext ctx);
	/**
	 * Exit a parse tree produced by {@link pruebaParser#if_sent}.
	 * @param ctx the parse tree
	 */
	void exitIf_sent(pruebaParser.If_sentContext ctx);
	/**
	 * Enter a parse tree produced by {@link pruebaParser#cond_bloq}.
	 * @param ctx the parse tree
	 */
	void enterCond_bloq(pruebaParser.Cond_bloqContext ctx);
	/**
	 * Exit a parse tree produced by {@link pruebaParser#cond_bloq}.
	 * @param ctx the parse tree
	 */
	void exitCond_bloq(pruebaParser.Cond_bloqContext ctx);
	/**
	 * Enter a parse tree produced by {@link pruebaParser#while_sent}.
	 * @param ctx the parse tree
	 */
	void enterWhile_sent(pruebaParser.While_sentContext ctx);
	/**
	 * Exit a parse tree produced by {@link pruebaParser#while_sent}.
	 * @param ctx the parse tree
	 */
	void exitWhile_sent(pruebaParser.While_sentContext ctx);
	/**
	 * Enter a parse tree produced by {@link pruebaParser#do_while_sent}.
	 * @param ctx the parse tree
	 */
	void enterDo_while_sent(pruebaParser.Do_while_sentContext ctx);
	/**
	 * Exit a parse tree produced by {@link pruebaParser#do_while_sent}.
	 * @param ctx the parse tree
	 */
	void exitDo_while_sent(pruebaParser.Do_while_sentContext ctx);
	/**
	 * Enter a parse tree produced by {@link pruebaParser#seleccionar_senten}.
	 * @param ctx the parse tree
	 */
	void enterSeleccionar_senten(pruebaParser.Seleccionar_sentenContext ctx);
	/**
	 * Exit a parse tree produced by {@link pruebaParser#seleccionar_senten}.
	 * @param ctx the parse tree
	 */
	void exitSeleccionar_senten(pruebaParser.Seleccionar_sentenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code casosGen}
	 * labeled alternative in {@link pruebaParser#casos}.
	 * @param ctx the parse tree
	 */
	void enterCasosGen(pruebaParser.CasosGenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code casosGen}
	 * labeled alternative in {@link pruebaParser#casos}.
	 * @param ctx the parse tree
	 */
	void exitCasosGen(pruebaParser.CasosGenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code casosDef}
	 * labeled alternative in {@link pruebaParser#casos}.
	 * @param ctx the parse tree
	 */
	void enterCasosDef(pruebaParser.CasosDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code casosDef}
	 * labeled alternative in {@link pruebaParser#casos}.
	 * @param ctx the parse tree
	 */
	void exitCasosDef(pruebaParser.CasosDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link pruebaParser#for}.
	 * @param ctx the parse tree
	 */
	void enterFor(pruebaParser.ForContext ctx);
	/**
	 * Exit a parse tree produced by {@link pruebaParser#for}.
	 * @param ctx the parse tree
	 */
	void exitFor(pruebaParser.ForContext ctx);
	/**
	 * Enter a parse tree produced by {@link pruebaParser#funct_sent}.
	 * @param ctx the parse tree
	 */
	void enterFunct_sent(pruebaParser.Funct_sentContext ctx);
	/**
	 * Exit a parse tree produced by {@link pruebaParser#funct_sent}.
	 * @param ctx the parse tree
	 */
	void exitFunct_sent(pruebaParser.Funct_sentContext ctx);
	/**
	 * Enter a parse tree produced by {@link pruebaParser#proc_sent}.
	 * @param ctx the parse tree
	 */
	void enterProc_sent(pruebaParser.Proc_sentContext ctx);
	/**
	 * Exit a parse tree produced by {@link pruebaParser#proc_sent}.
	 * @param ctx the parse tree
	 */
	void exitProc_sent(pruebaParser.Proc_sentContext ctx);
	/**
	 * Enter a parse tree produced by {@link pruebaParser#funcion}.
	 * @param ctx the parse tree
	 */
	void enterFuncion(pruebaParser.FuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link pruebaParser#funcion}.
	 * @param ctx the parse tree
	 */
	void exitFuncion(pruebaParser.FuncionContext ctx);
}