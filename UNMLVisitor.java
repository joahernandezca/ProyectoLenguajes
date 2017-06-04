// Generated from UNML.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link UNMLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface UNMLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link UNMLParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(UNMLParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link UNMLParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(UNMLParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link UNMLParser#propositions_sequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropositions_sequence(UNMLParser.Propositions_sequenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link UNMLParser#proposition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProposition(UNMLParser.PropositionContext ctx);
	/**
	 * Visit a parse tree produced by {@link UNMLParser#assign_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_statement(UNMLParser.Assign_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link UNMLParser#inequation_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInequation_operator(UNMLParser.Inequation_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link UNMLParser#numeric_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeric_literal(UNMLParser.Numeric_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link UNMLParser#building_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuilding_block(UNMLParser.Building_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link UNMLParser#function_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_statement(UNMLParser.Function_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link UNMLParser#constrain_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstrain_statement(UNMLParser.Constrain_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link UNMLParser#type_objective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_objective(UNMLParser.Type_objectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link UNMLParser#short_lineal_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShort_lineal_exp(UNMLParser.Short_lineal_expContext ctx);
	/**
	 * Visit a parse tree produced by {@link UNMLParser#lineal_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineal_expression(UNMLParser.Lineal_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link UNMLParser#lineal_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineal_operator(UNMLParser.Lineal_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link UNMLParser#aritmetic_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAritmetic_operator(UNMLParser.Aritmetic_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link UNMLParser#numeric_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeric_expression(UNMLParser.Numeric_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link UNMLParser#aritmetic_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAritmetic_expression(UNMLParser.Aritmetic_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link UNMLParser#logical_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_expression(UNMLParser.Logical_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link UNMLParser#subscripted_parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscripted_parameters(UNMLParser.Subscripted_parametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link UNMLParser#function_reference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_reference(UNMLParser.Function_referenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link UNMLParser#conditional_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional_expression(UNMLParser.Conditional_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link UNMLParser#list_of_ids}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_ids(UNMLParser.List_of_idsContext ctx);
	/**
	 * Visit a parse tree produced by {@link UNMLParser#logic_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogic_operator(UNMLParser.Logic_operatorContext ctx);
}