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
	 * Visit a parse tree produced by {@link MySQLParser#transcationStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTranscationStat(MySQLParser.TranscationStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#commit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommit(MySQLParser.CommitContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#rollback}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRollback(MySQLParser.RollbackContext ctx);
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
	 * Visit a parse tree produced by {@link MySQLParser#valueList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueList(MySQLParser.ValueListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#selectStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectStat(MySQLParser.SelectStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#selectInner}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectInner(MySQLParser.SelectInnerContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#selectPrefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectPrefix(MySQLParser.SelectPrefixContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#selectSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectSuffix(MySQLParser.SelectSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#selectUnionSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectUnionSuffix(MySQLParser.SelectUnionSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#selectExprs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectExprs(MySQLParser.SelectExprsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#tables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTables(MySQLParser.TablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#tableRel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableRel(MySQLParser.TableRelContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#tableFactor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableFactor(MySQLParser.TableFactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#tableSubQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableSubQuery(MySQLParser.TableSubQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#tableRecu}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableRecu(MySQLParser.TableRecuContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#tableJoin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableJoin(MySQLParser.TableJoinContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#tableJoinSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableJoinSuffix(MySQLParser.TableJoinSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#tableJoinMod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableJoinMod(MySQLParser.TableJoinModContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#joinCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinCondition(MySQLParser.JoinConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#gbobExprs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGbobExprs(MySQLParser.GbobExprsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#updateStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdateStat(MySQLParser.UpdateStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#updateSingleTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdateSingleTable(MySQLParser.UpdateSingleTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#updateMultipleTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdateMultipleTable(MySQLParser.UpdateMultipleTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#setExprs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetExprs(MySQLParser.SetExprsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#setExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetExpr(MySQLParser.SetExprContext ctx);
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
	 * Visit a parse tree produced by {@link MySQLParser#tableNameAndAliases}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableNameAndAliases(MySQLParser.TableNameAndAliasesContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#whereCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereCondition(MySQLParser.WhereConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#whereCondSub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereCondSub(MySQLParser.WhereCondSubContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#whereCondOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereCondOp(MySQLParser.WhereCondOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(MySQLParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#exprRelational}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprRelational(MySQLParser.ExprRelationalContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#exprBetweenAnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprBetweenAnd(MySQLParser.ExprBetweenAndContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#exprIsOrIsNotNull}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprIsOrIsNotNull(MySQLParser.ExprIsOrIsNotNullContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#exprInSelect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprInSelect(MySQLParser.ExprInSelectContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#exprInValues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprInValues(MySQLParser.ExprInValuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#exprExists}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprExists(MySQLParser.ExprExistsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#exprNot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprNot(MySQLParser.ExprNotContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#exprLike}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprLike(MySQLParser.ExprLikeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(MySQLParser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#elementOpFactory}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementOpFactory(MySQLParser.ElementOpFactoryContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#elementText}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementText(MySQLParser.ElementTextContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#elementTextParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementTextParam(MySQLParser.ElementTextParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#elementDate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementDate(MySQLParser.ElementDateContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#elementSubQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementSubQuery(MySQLParser.ElementSubQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#elementWapperBkt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementWapperBkt(MySQLParser.ElementWapperBktContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#elementListFactor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementListFactor(MySQLParser.ElementListFactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#elementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementList(MySQLParser.ElementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#elementOpEle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementOpEle(MySQLParser.ElementOpEleContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#elementOpEleSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementOpEleSuffix(MySQLParser.ElementOpEleSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#elementCase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementCase(MySQLParser.ElementCaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#caseWhenPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseWhenPart(MySQLParser.CaseWhenPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#elementWithPrefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementWithPrefix(MySQLParser.ElementWithPrefixContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#elementRow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementRow(MySQLParser.ElementRowContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#funCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunCall(MySQLParser.FunCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#paramList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamList(MySQLParser.ParamListContext ctx);
}