// Generated from UNML.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link UNMLParser}.
 */
public interface UNMLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link UNMLParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(UNMLParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link UNMLParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(UNMLParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link UNMLParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(UNMLParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link UNMLParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(UNMLParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link UNMLParser#propositions_sequence}.
	 * @param ctx the parse tree
	 */
	void enterPropositions_sequence(UNMLParser.Propositions_sequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link UNMLParser#propositions_sequence}.
	 * @param ctx the parse tree
	 */
	void exitPropositions_sequence(UNMLParser.Propositions_sequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link UNMLParser#proposition}.
	 * @param ctx the parse tree
	 */
	void enterProposition(UNMLParser.PropositionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UNMLParser#proposition}.
	 * @param ctx the parse tree
	 */
	void exitProposition(UNMLParser.PropositionContext ctx);
	/**
	 * Enter a parse tree produced by {@link UNMLParser#prop_solve}.
	 * @param ctx the parse tree
	 */
	void enterProp_solve(UNMLParser.Prop_solveContext ctx);
	/**
	 * Exit a parse tree produced by {@link UNMLParser#prop_solve}.
	 * @param ctx the parse tree
	 */
	void exitProp_solve(UNMLParser.Prop_solveContext ctx);
	/**
	 * Enter a parse tree produced by {@link UNMLParser#assign_statement}.
	 * @param ctx the parse tree
	 */
	void enterAssign_statement(UNMLParser.Assign_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link UNMLParser#assign_statement}.
	 * @param ctx the parse tree
	 */
	void exitAssign_statement(UNMLParser.Assign_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link UNMLParser#inequation_operator}.
	 * @param ctx the parse tree
	 */
	void enterInequation_operator(UNMLParser.Inequation_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link UNMLParser#inequation_operator}.
	 * @param ctx the parse tree
	 */
	void exitInequation_operator(UNMLParser.Inequation_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link UNMLParser#numeric_literal}.
	 * @param ctx the parse tree
	 */
	void enterNumeric_literal(UNMLParser.Numeric_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link UNMLParser#numeric_literal}.
	 * @param ctx the parse tree
	 */
	void exitNumeric_literal(UNMLParser.Numeric_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link UNMLParser#numeric_unsing}.
	 * @param ctx the parse tree
	 */
	void enterNumeric_unsing(UNMLParser.Numeric_unsingContext ctx);
	/**
	 * Exit a parse tree produced by {@link UNMLParser#numeric_unsing}.
	 * @param ctx the parse tree
	 */
	void exitNumeric_unsing(UNMLParser.Numeric_unsingContext ctx);
	/**
	 * Enter a parse tree produced by {@link UNMLParser#building_block}.
	 * @param ctx the parse tree
	 */
	void enterBuilding_block(UNMLParser.Building_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link UNMLParser#building_block}.
	 * @param ctx the parse tree
	 */
	void exitBuilding_block(UNMLParser.Building_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link UNMLParser#function_statement}.
	 * @param ctx the parse tree
	 */
	void enterFunction_statement(UNMLParser.Function_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link UNMLParser#function_statement}.
	 * @param ctx the parse tree
	 */
	void exitFunction_statement(UNMLParser.Function_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link UNMLParser#constrain_statement}.
	 * @param ctx the parse tree
	 */
	void enterConstrain_statement(UNMLParser.Constrain_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link UNMLParser#constrain_statement}.
	 * @param ctx the parse tree
	 */
	void exitConstrain_statement(UNMLParser.Constrain_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link UNMLParser#type_objective}.
	 * @param ctx the parse tree
	 */
	void enterType_objective(UNMLParser.Type_objectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link UNMLParser#type_objective}.
	 * @param ctx the parse tree
	 */
	void exitType_objective(UNMLParser.Type_objectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link UNMLParser#short_lineal_exp}.
	 * @param ctx the parse tree
	 */
	void enterShort_lineal_exp(UNMLParser.Short_lineal_expContext ctx);
	/**
	 * Exit a parse tree produced by {@link UNMLParser#short_lineal_exp}.
	 * @param ctx the parse tree
	 */
	void exitShort_lineal_exp(UNMLParser.Short_lineal_expContext ctx);
	/**
	 * Enter a parse tree produced by {@link UNMLParser#lineal_expression}.
	 * @param ctx the parse tree
	 */
	void enterLineal_expression(UNMLParser.Lineal_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UNMLParser#lineal_expression}.
	 * @param ctx the parse tree
	 */
	void exitLineal_expression(UNMLParser.Lineal_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link UNMLParser#lineal_operator}.
	 * @param ctx the parse tree
	 */
	void enterLineal_operator(UNMLParser.Lineal_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link UNMLParser#lineal_operator}.
	 * @param ctx the parse tree
	 */
	void exitLineal_operator(UNMLParser.Lineal_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link UNMLParser#aritmetic_operator}.
	 * @param ctx the parse tree
	 */
	void enterAritmetic_operator(UNMLParser.Aritmetic_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link UNMLParser#aritmetic_operator}.
	 * @param ctx the parse tree
	 */
	void exitAritmetic_operator(UNMLParser.Aritmetic_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link UNMLParser#numeric_expression}.
	 * @param ctx the parse tree
	 */
	void enterNumeric_expression(UNMLParser.Numeric_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UNMLParser#numeric_expression}.
	 * @param ctx the parse tree
	 */
	void exitNumeric_expression(UNMLParser.Numeric_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link UNMLParser#aritmetic_expression}.
	 * @param ctx the parse tree
	 */
	void enterAritmetic_expression(UNMLParser.Aritmetic_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UNMLParser#aritmetic_expression}.
	 * @param ctx the parse tree
	 */
	void exitAritmetic_expression(UNMLParser.Aritmetic_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link UNMLParser#logical_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogical_expression(UNMLParser.Logical_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UNMLParser#logical_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogical_expression(UNMLParser.Logical_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link UNMLParser#subscripted_parameters}.
	 * @param ctx the parse tree
	 */
	void enterSubscripted_parameters(UNMLParser.Subscripted_parametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link UNMLParser#subscripted_parameters}.
	 * @param ctx the parse tree
	 */
	void exitSubscripted_parameters(UNMLParser.Subscripted_parametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link UNMLParser#function_reference}.
	 * @param ctx the parse tree
	 */
	void enterFunction_reference(UNMLParser.Function_referenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link UNMLParser#function_reference}.
	 * @param ctx the parse tree
	 */
	void exitFunction_reference(UNMLParser.Function_referenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link UNMLParser#conditional_expression}.
	 * @param ctx the parse tree
	 */
	void enterConditional_expression(UNMLParser.Conditional_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UNMLParser#conditional_expression}.
	 * @param ctx the parse tree
	 */
	void exitConditional_expression(UNMLParser.Conditional_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link UNMLParser#list_of_ids}.
	 * @param ctx the parse tree
	 */
	void enterList_of_ids(UNMLParser.List_of_idsContext ctx);
	/**
	 * Exit a parse tree produced by {@link UNMLParser#list_of_ids}.
	 * @param ctx the parse tree
	 */
	void exitList_of_ids(UNMLParser.List_of_idsContext ctx);
	/**
	 * Enter a parse tree produced by {@link UNMLParser#logic_operator}.
	 * @param ctx the parse tree
	 */
	void enterLogic_operator(UNMLParser.Logic_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link UNMLParser#logic_operator}.
	 * @param ctx the parse tree
	 */
	void exitLogic_operator(UNMLParser.Logic_operatorContext ctx);
}