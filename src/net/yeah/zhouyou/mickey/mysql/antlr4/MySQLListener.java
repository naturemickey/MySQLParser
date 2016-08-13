// Generated from src/net/yeah/zhouyou/mickey/mysql/antlr4/MySQL.g4 by ANTLR 4.5.3
package net.yeah.zhouyou.mickey.mysql.antlr4;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MySQLParser}.
 */
public interface MySQLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MySQLParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(MySQLParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(MySQLParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#insertStat}.
	 * @param ctx the parse tree
	 */
	void enterInsertStat(MySQLParser.InsertStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#insertStat}.
	 * @param ctx the parse tree
	 */
	void exitInsertStat(MySQLParser.InsertStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#columnNames}.
	 * @param ctx the parse tree
	 */
	void enterColumnNames(MySQLParser.ColumnNamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#columnNames}.
	 * @param ctx the parse tree
	 */
	void exitColumnNames(MySQLParser.ColumnNamesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#columnNamesSuffix}.
	 * @param ctx the parse tree
	 */
	void enterColumnNamesSuffix(MySQLParser.ColumnNamesSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#columnNamesSuffix}.
	 * @param ctx the parse tree
	 */
	void exitColumnNamesSuffix(MySQLParser.ColumnNamesSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#valueList}.
	 * @param ctx the parse tree
	 */
	void enterValueList(MySQLParser.ValueListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#valueList}.
	 * @param ctx the parse tree
	 */
	void exitValueList(MySQLParser.ValueListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#valueListSuffix}.
	 * @param ctx the parse tree
	 */
	void enterValueListSuffix(MySQLParser.ValueListSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#valueListSuffix}.
	 * @param ctx the parse tree
	 */
	void exitValueListSuffix(MySQLParser.ValueListSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#selectStat}.
	 * @param ctx the parse tree
	 */
	void enterSelectStat(MySQLParser.SelectStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#selectStat}.
	 * @param ctx the parse tree
	 */
	void exitSelectStat(MySQLParser.SelectStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#updateStat}.
	 * @param ctx the parse tree
	 */
	void enterUpdateStat(MySQLParser.UpdateStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#updateStat}.
	 * @param ctx the parse tree
	 */
	void exitUpdateStat(MySQLParser.UpdateStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#deleteStat}.
	 * @param ctx the parse tree
	 */
	void enterDeleteStat(MySQLParser.DeleteStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#deleteStat}.
	 * @param ctx the parse tree
	 */
	void exitDeleteStat(MySQLParser.DeleteStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#tableNameAndAlias}.
	 * @param ctx the parse tree
	 */
	void enterTableNameAndAlias(MySQLParser.TableNameAndAliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#tableNameAndAlias}.
	 * @param ctx the parse tree
	 */
	void exitTableNameAndAlias(MySQLParser.TableNameAndAliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#whereCondition}.
	 * @param ctx the parse tree
	 */
	void enterWhereCondition(MySQLParser.WhereConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#whereCondition}.
	 * @param ctx the parse tree
	 */
	void exitWhereCondition(MySQLParser.WhereConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#whereCondSub}.
	 * @param ctx the parse tree
	 */
	void enterWhereCondSub(MySQLParser.WhereCondSubContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#whereCondSub}.
	 * @param ctx the parse tree
	 */
	void exitWhereCondSub(MySQLParser.WhereCondSubContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#whereCondOp}.
	 * @param ctx the parse tree
	 */
	void enterWhereCondOp(MySQLParser.WhereCondOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#whereCondOp}.
	 * @param ctx the parse tree
	 */
	void exitWhereCondOp(MySQLParser.WhereCondOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(MySQLParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(MySQLParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#exprRelational}.
	 * @param ctx the parse tree
	 */
	void enterExprRelational(MySQLParser.ExprRelationalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#exprRelational}.
	 * @param ctx the parse tree
	 */
	void exitExprRelational(MySQLParser.ExprRelationalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#exprBetweenAnd}.
	 * @param ctx the parse tree
	 */
	void enterExprBetweenAnd(MySQLParser.ExprBetweenAndContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#exprBetweenAnd}.
	 * @param ctx the parse tree
	 */
	void exitExprBetweenAnd(MySQLParser.ExprBetweenAndContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#exprIsOrIsNotNull}.
	 * @param ctx the parse tree
	 */
	void enterExprIsOrIsNotNull(MySQLParser.ExprIsOrIsNotNullContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#exprIsOrIsNotNull}.
	 * @param ctx the parse tree
	 */
	void exitExprIsOrIsNotNull(MySQLParser.ExprIsOrIsNotNullContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#exprInSelect}.
	 * @param ctx the parse tree
	 */
	void enterExprInSelect(MySQLParser.ExprInSelectContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#exprInSelect}.
	 * @param ctx the parse tree
	 */
	void exitExprInSelect(MySQLParser.ExprInSelectContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#exprInValues}.
	 * @param ctx the parse tree
	 */
	void enterExprInValues(MySQLParser.ExprInValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#exprInValues}.
	 * @param ctx the parse tree
	 */
	void exitExprInValues(MySQLParser.ExprInValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#exprExists}.
	 * @param ctx the parse tree
	 */
	void enterExprExists(MySQLParser.ExprExistsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#exprExists}.
	 * @param ctx the parse tree
	 */
	void exitExprExists(MySQLParser.ExprExistsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#exprNot}.
	 * @param ctx the parse tree
	 */
	void enterExprNot(MySQLParser.ExprNotContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#exprNot}.
	 * @param ctx the parse tree
	 */
	void exitExprNot(MySQLParser.ExprNotContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(MySQLParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(MySQLParser.ElementContext ctx);
}