// Generated from src/net/yeah/zhouyou/mickey/mysql/antlr4/MySQL.g4 by ANTLR 4.5.3
package net.yeah.zhouyou.mickey.mysql.antlr4;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MySQLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MySQLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MySQLParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(MySQLParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#insertStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertStat(MySQLParser.InsertStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#columnNames}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnNames(MySQLParser.ColumnNamesContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#columnNamesSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnNamesSuffix(MySQLParser.ColumnNamesSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#valueList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueList(MySQLParser.ValueListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#valueListSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueListSuffix(MySQLParser.ValueListSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#selectStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectStat(MySQLParser.SelectStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#updateStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdateStat(MySQLParser.UpdateStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#deleteStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeleteStat(MySQLParser.DeleteStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#tableNameAndAlias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableNameAndAlias(MySQLParser.TableNameAndAliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#whereCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereCondition(MySQLParser.WhereConditionContext ctx);
}