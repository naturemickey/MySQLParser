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
	 * Enter a parse tree produced by {@link MySQLParser#transcationStat}.
	 * @param ctx the parse tree
	 */
	void enterTranscationStat(MySQLParser.TranscationStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#transcationStat}.
	 * @param ctx the parse tree
	 */
	void exitTranscationStat(MySQLParser.TranscationStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#commit}.
	 * @param ctx the parse tree
	 */
	void enterCommit(MySQLParser.CommitContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#commit}.
	 * @param ctx the parse tree
	 */
	void exitCommit(MySQLParser.CommitContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#rollback}.
	 * @param ctx the parse tree
	 */
	void enterRollback(MySQLParser.RollbackContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#rollback}.
	 * @param ctx the parse tree
	 */
	void exitRollback(MySQLParser.RollbackContext ctx);
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
	 * Enter a parse tree produced by {@link MySQLParser#selectInner}.
	 * @param ctx the parse tree
	 */
	void enterSelectInner(MySQLParser.SelectInnerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#selectInner}.
	 * @param ctx the parse tree
	 */
	void exitSelectInner(MySQLParser.SelectInnerContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#selectPrefix}.
	 * @param ctx the parse tree
	 */
	void enterSelectPrefix(MySQLParser.SelectPrefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#selectPrefix}.
	 * @param ctx the parse tree
	 */
	void exitSelectPrefix(MySQLParser.SelectPrefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#selectSuffix}.
	 * @param ctx the parse tree
	 */
	void enterSelectSuffix(MySQLParser.SelectSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#selectSuffix}.
	 * @param ctx the parse tree
	 */
	void exitSelectSuffix(MySQLParser.SelectSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#selectUnionSuffix}.
	 * @param ctx the parse tree
	 */
	void enterSelectUnionSuffix(MySQLParser.SelectUnionSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#selectUnionSuffix}.
	 * @param ctx the parse tree
	 */
	void exitSelectUnionSuffix(MySQLParser.SelectUnionSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#selectExprs}.
	 * @param ctx the parse tree
	 */
	void enterSelectExprs(MySQLParser.SelectExprsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#selectExprs}.
	 * @param ctx the parse tree
	 */
	void exitSelectExprs(MySQLParser.SelectExprsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#tables}.
	 * @param ctx the parse tree
	 */
	void enterTables(MySQLParser.TablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#tables}.
	 * @param ctx the parse tree
	 */
	void exitTables(MySQLParser.TablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#tableRel}.
	 * @param ctx the parse tree
	 */
	void enterTableRel(MySQLParser.TableRelContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#tableRel}.
	 * @param ctx the parse tree
	 */
	void exitTableRel(MySQLParser.TableRelContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#tableFactor}.
	 * @param ctx the parse tree
	 */
	void enterTableFactor(MySQLParser.TableFactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#tableFactor}.
	 * @param ctx the parse tree
	 */
	void exitTableFactor(MySQLParser.TableFactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#tableSubQuery}.
	 * @param ctx the parse tree
	 */
	void enterTableSubQuery(MySQLParser.TableSubQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#tableSubQuery}.
	 * @param ctx the parse tree
	 */
	void exitTableSubQuery(MySQLParser.TableSubQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#tableRecu}.
	 * @param ctx the parse tree
	 */
	void enterTableRecu(MySQLParser.TableRecuContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#tableRecu}.
	 * @param ctx the parse tree
	 */
	void exitTableRecu(MySQLParser.TableRecuContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#tableJoin}.
	 * @param ctx the parse tree
	 */
	void enterTableJoin(MySQLParser.TableJoinContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#tableJoin}.
	 * @param ctx the parse tree
	 */
	void exitTableJoin(MySQLParser.TableJoinContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#tableJoinSuffix}.
	 * @param ctx the parse tree
	 */
	void enterTableJoinSuffix(MySQLParser.TableJoinSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#tableJoinSuffix}.
	 * @param ctx the parse tree
	 */
	void exitTableJoinSuffix(MySQLParser.TableJoinSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#tableJoinMod}.
	 * @param ctx the parse tree
	 */
	void enterTableJoinMod(MySQLParser.TableJoinModContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#tableJoinMod}.
	 * @param ctx the parse tree
	 */
	void exitTableJoinMod(MySQLParser.TableJoinModContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#joinCondition}.
	 * @param ctx the parse tree
	 */
	void enterJoinCondition(MySQLParser.JoinConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#joinCondition}.
	 * @param ctx the parse tree
	 */
	void exitJoinCondition(MySQLParser.JoinConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#gbobExprs}.
	 * @param ctx the parse tree
	 */
	void enterGbobExprs(MySQLParser.GbobExprsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#gbobExprs}.
	 * @param ctx the parse tree
	 */
	void exitGbobExprs(MySQLParser.GbobExprsContext ctx);
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
	 * Enter a parse tree produced by {@link MySQLParser#updateSingleTable}.
	 * @param ctx the parse tree
	 */
	void enterUpdateSingleTable(MySQLParser.UpdateSingleTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#updateSingleTable}.
	 * @param ctx the parse tree
	 */
	void exitUpdateSingleTable(MySQLParser.UpdateSingleTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#updateMultipleTable}.
	 * @param ctx the parse tree
	 */
	void enterUpdateMultipleTable(MySQLParser.UpdateMultipleTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#updateMultipleTable}.
	 * @param ctx the parse tree
	 */
	void exitUpdateMultipleTable(MySQLParser.UpdateMultipleTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#setExprs}.
	 * @param ctx the parse tree
	 */
	void enterSetExprs(MySQLParser.SetExprsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#setExprs}.
	 * @param ctx the parse tree
	 */
	void exitSetExprs(MySQLParser.SetExprsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#setExpr}.
	 * @param ctx the parse tree
	 */
	void enterSetExpr(MySQLParser.SetExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#setExpr}.
	 * @param ctx the parse tree
	 */
	void exitSetExpr(MySQLParser.SetExprContext ctx);
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
	 * Enter a parse tree produced by {@link MySQLParser#tableNameAndAliases}.
	 * @param ctx the parse tree
	 */
	void enterTableNameAndAliases(MySQLParser.TableNameAndAliasesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#tableNameAndAliases}.
	 * @param ctx the parse tree
	 */
	void exitTableNameAndAliases(MySQLParser.TableNameAndAliasesContext ctx);
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
	 * Enter a parse tree produced by {@link MySQLParser#exprLike}.
	 * @param ctx the parse tree
	 */
	void enterExprLike(MySQLParser.ExprLikeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#exprLike}.
	 * @param ctx the parse tree
	 */
	void exitExprLike(MySQLParser.ExprLikeContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link MySQLParser#elementOpFactory}.
	 * @param ctx the parse tree
	 */
	void enterElementOpFactory(MySQLParser.ElementOpFactoryContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#elementOpFactory}.
	 * @param ctx the parse tree
	 */
	void exitElementOpFactory(MySQLParser.ElementOpFactoryContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#elementText}.
	 * @param ctx the parse tree
	 */
	void enterElementText(MySQLParser.ElementTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#elementText}.
	 * @param ctx the parse tree
	 */
	void exitElementText(MySQLParser.ElementTextContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#elementTextParam}.
	 * @param ctx the parse tree
	 */
	void enterElementTextParam(MySQLParser.ElementTextParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#elementTextParam}.
	 * @param ctx the parse tree
	 */
	void exitElementTextParam(MySQLParser.ElementTextParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#elementDate}.
	 * @param ctx the parse tree
	 */
	void enterElementDate(MySQLParser.ElementDateContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#elementDate}.
	 * @param ctx the parse tree
	 */
	void exitElementDate(MySQLParser.ElementDateContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#elementSubQuery}.
	 * @param ctx the parse tree
	 */
	void enterElementSubQuery(MySQLParser.ElementSubQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#elementSubQuery}.
	 * @param ctx the parse tree
	 */
	void exitElementSubQuery(MySQLParser.ElementSubQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#elementWapperBkt}.
	 * @param ctx the parse tree
	 */
	void enterElementWapperBkt(MySQLParser.ElementWapperBktContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#elementWapperBkt}.
	 * @param ctx the parse tree
	 */
	void exitElementWapperBkt(MySQLParser.ElementWapperBktContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#elementListFactor}.
	 * @param ctx the parse tree
	 */
	void enterElementListFactor(MySQLParser.ElementListFactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#elementListFactor}.
	 * @param ctx the parse tree
	 */
	void exitElementListFactor(MySQLParser.ElementListFactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#elementList}.
	 * @param ctx the parse tree
	 */
	void enterElementList(MySQLParser.ElementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#elementList}.
	 * @param ctx the parse tree
	 */
	void exitElementList(MySQLParser.ElementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#elementOpEle}.
	 * @param ctx the parse tree
	 */
	void enterElementOpEle(MySQLParser.ElementOpEleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#elementOpEle}.
	 * @param ctx the parse tree
	 */
	void exitElementOpEle(MySQLParser.ElementOpEleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#elementOpEleSuffix}.
	 * @param ctx the parse tree
	 */
	void enterElementOpEleSuffix(MySQLParser.ElementOpEleSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#elementOpEleSuffix}.
	 * @param ctx the parse tree
	 */
	void exitElementOpEleSuffix(MySQLParser.ElementOpEleSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#elementCase}.
	 * @param ctx the parse tree
	 */
	void enterElementCase(MySQLParser.ElementCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#elementCase}.
	 * @param ctx the parse tree
	 */
	void exitElementCase(MySQLParser.ElementCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#caseWhenPart}.
	 * @param ctx the parse tree
	 */
	void enterCaseWhenPart(MySQLParser.CaseWhenPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#caseWhenPart}.
	 * @param ctx the parse tree
	 */
	void exitCaseWhenPart(MySQLParser.CaseWhenPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#elementWithPrefix}.
	 * @param ctx the parse tree
	 */
	void enterElementWithPrefix(MySQLParser.ElementWithPrefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#elementWithPrefix}.
	 * @param ctx the parse tree
	 */
	void exitElementWithPrefix(MySQLParser.ElementWithPrefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#elementRow}.
	 * @param ctx the parse tree
	 */
	void enterElementRow(MySQLParser.ElementRowContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#elementRow}.
	 * @param ctx the parse tree
	 */
	void exitElementRow(MySQLParser.ElementRowContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#funCall}.
	 * @param ctx the parse tree
	 */
	void enterFunCall(MySQLParser.FunCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#funCall}.
	 * @param ctx the parse tree
	 */
	void exitFunCall(MySQLParser.FunCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#paramList}.
	 * @param ctx the parse tree
	 */
	void enterParamList(MySQLParser.ParamListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#paramList}.
	 * @param ctx the parse tree
	 */
	void exitParamList(MySQLParser.ParamListContext ctx);
}