// Generated from LabeledExpr.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LabeledExprParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LabeledExprVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(LabeledExprParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiVariablesInit}
	 * labeled alternative in {@link LabeledExprParser#multi_var_init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiVariablesInit(LabeledExprParser.MultiVariablesInitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code initVariables}
	 * labeled alternative in {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitVariables(LabeledExprParser.InitVariablesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code initConstants}
	 * labeled alternative in {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitConstants(LabeledExprParser.InitConstantsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintExpr(LabeledExprParser.PrintExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printStringVal}
	 * labeled alternative in {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStringVal(LabeledExprParser.PrintStringValContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignStr}
	 * labeled alternative in {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStr(LabeledExprParser.AssignStrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignExpr}
	 * labeled alternative in {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignExpr(LabeledExprParser.AssignExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blank}
	 * labeled alternative in {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlank(LabeledExprParser.BlankContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifStatement}
	 * labeled alternative in {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(LabeledExprParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifElseStatement}
	 * labeled alternative in {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElseStatement(LabeledExprParser.IfElseStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileStatement}
	 * labeled alternative in {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(LabeledExprParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forStatement}
	 * labeled alternative in {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(LabeledExprParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code elseStat}
	 * labeled alternative in {@link LabeledExprParser#else_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseStat(LabeledExprParser.ElseStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParens(LabeledExprParser.ParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eval}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEval(LabeledExprParser.EvalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDiv(LabeledExprParser.MulDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(LabeledExprParser.AddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link LabeledExprParser#val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(LabeledExprParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code integer}
	 * labeled alternative in {@link LabeledExprParser#val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(LabeledExprParser.IntegerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code float}
	 * labeled alternative in {@link LabeledExprParser#val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat(LabeledExprParser.FloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code string}
	 * labeled alternative in {@link LabeledExprParser#str_val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(LabeledExprParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code concatString}
	 * labeled alternative in {@link LabeledExprParser#str_val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcatString(LabeledExprParser.ConcatStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code evalToString}
	 * labeled alternative in {@link LabeledExprParser#str_val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvalToString(LabeledExprParser.EvalToStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code evalGreat}
	 * labeled alternative in {@link LabeledExprParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvalGreat(LabeledExprParser.EvalGreatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code evalLess}
	 * labeled alternative in {@link LabeledExprParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvalLess(LabeledExprParser.EvalLessContext ctx);
}