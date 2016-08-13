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
}