package net.yeah.zhouyou.mickey.mysql;

import java.util.stream.Collectors;

import net.yeah.zhouyou.mickey.mysql.antlr4.MySQLBaseVisitor;
import net.yeah.zhouyou.mickey.mysql.antlr4.MySQLParser;
import net.yeah.zhouyou.mickey.mysql.tree.ColumnNamesNode;
import net.yeah.zhouyou.mickey.mysql.tree.DeleteNode;
import net.yeah.zhouyou.mickey.mysql.tree.ElementDateNode;
import net.yeah.zhouyou.mickey.mysql.tree.ElementNode;
import net.yeah.zhouyou.mickey.mysql.tree.ElementOpEleNode;
import net.yeah.zhouyou.mickey.mysql.tree.ElementOpEleSuffixNode;
import net.yeah.zhouyou.mickey.mysql.tree.ElementSubQueryNode;
import net.yeah.zhouyou.mickey.mysql.tree.ElementTextNode;
import net.yeah.zhouyou.mickey.mysql.tree.ExpressionBetweenAndNode;
import net.yeah.zhouyou.mickey.mysql.tree.ExpressionExistsNode;
import net.yeah.zhouyou.mickey.mysql.tree.ExpressionInSelectNode;
import net.yeah.zhouyou.mickey.mysql.tree.ExpressionInValuesNode;
import net.yeah.zhouyou.mickey.mysql.tree.ExpressionIsOrIsNotNode;
import net.yeah.zhouyou.mickey.mysql.tree.ExpressionNode;
import net.yeah.zhouyou.mickey.mysql.tree.ExpressionNotNode;
import net.yeah.zhouyou.mickey.mysql.tree.ExpressionRelationalNode;
import net.yeah.zhouyou.mickey.mysql.tree.FunCallNode;
import net.yeah.zhouyou.mickey.mysql.tree.GbobExprsNode;
import net.yeah.zhouyou.mickey.mysql.tree.InsertNode;
import net.yeah.zhouyou.mickey.mysql.tree.JoinConditionNode;
import net.yeah.zhouyou.mickey.mysql.tree.ParamListNode;
import net.yeah.zhouyou.mickey.mysql.tree.SQLSyntaxTreeNode;
import net.yeah.zhouyou.mickey.mysql.tree.SelectExprsNode;
import net.yeah.zhouyou.mickey.mysql.tree.SelectNode;
import net.yeah.zhouyou.mickey.mysql.tree.SetExprNode;
import net.yeah.zhouyou.mickey.mysql.tree.SetExprsNode;
import net.yeah.zhouyou.mickey.mysql.tree.TableJoinNode;
import net.yeah.zhouyou.mickey.mysql.tree.TableJoinSuffixNode;
import net.yeah.zhouyou.mickey.mysql.tree.TableNameAndAliasNode;
import net.yeah.zhouyou.mickey.mysql.tree.TableNameAndAliasesNode;
import net.yeah.zhouyou.mickey.mysql.tree.TableRecuNode;
import net.yeah.zhouyou.mickey.mysql.tree.TableRelNode;
import net.yeah.zhouyou.mickey.mysql.tree.TableSubQueryNode;
import net.yeah.zhouyou.mickey.mysql.tree.TablesNode;
import net.yeah.zhouyou.mickey.mysql.tree.UpdateMultipleTableNode;
import net.yeah.zhouyou.mickey.mysql.tree.UpdateSignleTableNode;
import net.yeah.zhouyou.mickey.mysql.tree.ValueListNode;
import net.yeah.zhouyou.mickey.mysql.tree.WhereConditionNode;
import net.yeah.zhouyou.mickey.mysql.tree.WhereConditionOpNode;
import net.yeah.zhouyou.mickey.mysql.tree.WhereConditionSubNode;

public class MySQLVisitorImpl extends MySQLBaseVisitor<SQLSyntaxTreeNode> {

	@Override
	public SQLSyntaxTreeNode visitInsertStat(MySQLParser.InsertStatContext ctx) {
		String tableName = ctx.tableName.getText();
		ColumnNamesNode columnNames = ctx.columnNames() == null ? null : (ColumnNamesNode) visitColumnNames(ctx.columnNames());
		ValueListNode valueNames = ctx.valueList() == null ? null : (ValueListNode) visitValueList(ctx.valueList());
		SelectNode select = ctx.selectStat() == null ? null : (SelectNode) this.visitSelectStat(ctx.selectStat());
		if (valueNames != null) {
			return new InsertNode(tableName, columnNames, valueNames);
		} else {
			return new InsertNode(tableName, columnNames, select);
		}
	}

	@Override
	public SQLSyntaxTreeNode visitColumnNames(MySQLParser.ColumnNamesContext ctx) {
		String name = ctx.name.getText();
		ColumnNamesNode suffix = ctx.columnNamesSuffix() != null ? (ColumnNamesNode) visitColumnNamesSuffix(ctx.columnNamesSuffix()) : null;

		return new ColumnNamesNode(name, suffix);
	}

	@Override
	public SQLSyntaxTreeNode visitColumnNamesSuffix(MySQLParser.ColumnNamesSuffixContext ctx) {
		return visitColumnNames(ctx.columnNames());
	}

	@Override
	public SQLSyntaxTreeNode visitValueList(MySQLParser.ValueListContext ctx) {
		String name = ctx.name.getText();
		ValueListNode suffix = ctx.valueListSuffix() != null ? (ValueListNode) visitValueListSuffix(ctx.valueListSuffix()) : null;

		return new ValueListNode(name, suffix);
	}

	@Override
	public SQLSyntaxTreeNode visitValueListSuffix(MySQLParser.ValueListSuffixContext ctx) {
		return visitValueList(ctx.valueList());
	}

	@Override
	public SQLSyntaxTreeNode visitDeleteStat(MySQLParser.DeleteStatContext ctx) {
		TableNameAndAliasNode tableNameAndAlias = (TableNameAndAliasNode) this.visitTableNameAndAlias(ctx.tableNameAndAlias());
		WhereConditionNode whereCondition = ctx.whereCondition() != null ? (WhereConditionNode) this.visitWhereCondition(ctx.whereCondition()) : null;
		String rowCount = ctx.rowCount != null ? ctx.rowCount.getText() : null;

		return new DeleteNode(tableNameAndAlias, whereCondition, rowCount);
	}

	@Override
	public SQLSyntaxTreeNode visitTableNameAndAlias(MySQLParser.TableNameAndAliasContext ctx) {
		return new TableNameAndAliasNode(ctx.name.getText(), ctx.alias == null ? null : ctx.alias.getText());
	}

	@Override
	public SQLSyntaxTreeNode visitTableNameAndAliases(MySQLParser.TableNameAndAliasesContext ctx) {
		TableNameAndAliasNode tableNameAndAlias = (TableNameAndAliasNode) this.visitTableNameAndAlias(ctx.tableNameAndAlias());
		TableNameAndAliasesNode suffix = ctx.tableNameAndAliasSuffix() != null
				? (TableNameAndAliasesNode) this.visitTableNameAndAliasSuffix(ctx.tableNameAndAliasSuffix()) : null;

		return new TableNameAndAliasesNode(tableNameAndAlias, suffix);
	}

	@Override
	public SQLSyntaxTreeNode visitTableNameAndAliasSuffix(MySQLParser.TableNameAndAliasSuffixContext ctx) {
		return this.visitTableNameAndAliases(ctx.tableNameAndAliases());
	}

	@Override
	public SQLSyntaxTreeNode visitWhereCondSub(MySQLParser.WhereCondSubContext ctx) {
		WhereConditionNode wc1 = (WhereConditionNode) this.visitWhereCondition(ctx.wc1);
		String expressionOperator = ctx.expressionOperator != null ? ctx.expressionOperator.getText() : null;
		WhereConditionNode wc2 = ctx.expressionOperator != null ? (WhereConditionNode) this.visitWhereCondition(ctx.wc2) : null;

		return new WhereConditionSubNode(wc1, expressionOperator, wc2);
	}

	@Override
	public SQLSyntaxTreeNode visitWhereCondOp(MySQLParser.WhereCondOpContext ctx) {
		ExpressionNode expression = (ExpressionNode) this.visitExpression(ctx.expression());
		String expressionOperator = ctx.expressionOperator != null ? ctx.expressionOperator.getText() : null;
		WhereConditionNode whereCondition = ctx.expressionOperator != null ? (WhereConditionNode) this.visitWhereCondition(ctx.whereCondition()) : null;
		return new WhereConditionOpNode(expression, expressionOperator, whereCondition);
	}

	@Override
	public SQLSyntaxTreeNode visitExprRelational(MySQLParser.ExprRelationalContext ctx) {
		ElementNode left = (ElementNode) this.visitElement(ctx.left);
		ElementNode right = (ElementNode) this.visitElement(ctx.right);
		String relationalOp = ctx.relationalOp.getText();
		return new ExpressionRelationalNode(left, right, relationalOp);
	}

	@Override
	public SQLSyntaxTreeNode visitExprBetweenAnd(MySQLParser.ExprBetweenAndContext ctx) {
		ElementNode element = (ElementNode) this.visitElement(ctx.el);
		ElementNode left = (ElementNode) this.visitElement(ctx.left);
		ElementNode right = (ElementNode) this.visitElement(ctx.right);
		boolean not = ctx.not != null;
		return new ExpressionBetweenAndNode(element, not, left, right);
	}

	@Override
	public SQLSyntaxTreeNode visitExprIsOrIsNotNull(MySQLParser.ExprIsOrIsNotNullContext ctx) {
		ElementNode element = (ElementNode) this.visitElement(ctx.element());
		boolean not = ctx.not != null;
		return new ExpressionIsOrIsNotNode(element, not);
	}

	@Override
	public SQLSyntaxTreeNode visitExprInSelect(MySQLParser.ExprInSelectContext ctx) {
		ElementNode element = (ElementNode) this.visitElement(ctx.element());
		boolean not = ctx.not != null;
		SelectNode select = (SelectNode) this.visitSelectStat(ctx.selectStat());
		return new ExpressionInSelectNode(element, not, select);
	}

	@Override
	public SQLSyntaxTreeNode visitExprInValues(MySQLParser.ExprInValuesContext ctx) {
		ElementNode element = (ElementNode) this.visitElement(ctx.element());
		boolean not = ctx.not != null;
		ValueListNode values = (ValueListNode) this.visitValueList(ctx.valueList());
		return new ExpressionInValuesNode(element, not, values);
	}

	@Override
	public SQLSyntaxTreeNode visitExprExists(MySQLParser.ExprExistsContext ctx) {
		boolean not = ctx.not != null;
		SelectNode select = (SelectNode) this.visitSelectStat(ctx.selectStat());
		return new ExpressionExistsNode(not, select);
	}

	@Override
	public SQLSyntaxTreeNode visitExprNot(MySQLParser.ExprNotContext ctx) {
		return new ExpressionNotNode((ExpressionNode) this.visitExpression(ctx.expression()));
	}

	// @Override
	// public SQLSyntaxTreeNode visitElement(MySQLParser.ElementContext ctx) {
	// String txt = null;
	// FunCallNode funCall = null;
	// SelectNode select = null;
	// if (ctx.txt != null) {
	// txt = ctx.txt.getText();
	// } else if (ctx.funCall() != null) {
	// funCall = (FunCallNode) this.visitFunCall(ctx.funCall());
	// } else {
	// select = (SelectNode) this.visitSelectStat(ctx.selectStat());
	// }
	// return new ElementNode(txt, funCall, select);
	// }

	@Override
	public SQLSyntaxTreeNode visitElementText(MySQLParser.ElementTextContext ctx) {
		return new ElementTextNode(ctx.getText());
	}

	@Override
	public SQLSyntaxTreeNode visitElementSubQuery(MySQLParser.ElementSubQueryContext ctx) {
		return new ElementSubQueryNode((SelectNode) this.visitSelectStat(ctx.selectStat()));
	}

	@Override
	public SQLSyntaxTreeNode visitElementDate(MySQLParser.ElementDateContext ctx) {
		return new ElementDateNode(ctx.STRING().getText());
	}

	@Override
	public SQLSyntaxTreeNode visitElementOpEle(MySQLParser.ElementOpEleContext ctx) {
		ElementTextNode elementText = (ElementTextNode) this.visitElementText(ctx.elementText());
		ElementOpEleSuffixNode suffix = ctx.elementOpEleSuffix() == null ? null : (ElementOpEleSuffixNode) this.visitElementOpEleSuffix(ctx.elementOpEleSuffix());
		return new ElementOpEleNode(elementText, suffix);
	}

	@Override
	public SQLSyntaxTreeNode visitElementOpEleSuffix(MySQLParser.ElementOpEleSuffixContext ctx) {
		String op = ctx.op == null ? null : ctx.op.getText();
		ElementOpEleNode element = (ElementOpEleNode) this.visitElementOpEle(ctx.elementOpEle());
		if (op == null) {
			// 加号和减号可能会被后面的数字合并解析，所以这里特殊处理。
			String text = element.getElementText().getTxt();
			op = String.valueOf(text.charAt(0));
			element.getElementText().setTxt(text.substring(1));
		}
		return new ElementOpEleSuffixNode(op, element);
	}

	@Override
	public SQLSyntaxTreeNode visitSetExprs(MySQLParser.SetExprsContext ctx) {
		SetExprNode setExpr = (SetExprNode) this.visitSetExpr(ctx.setExpr());
		SetExprsNode suffix = ctx.setExprSuffix() != null ? (SetExprsNode) this.visitSetExprSuffix(ctx.setExprSuffix()) : null;
		return new SetExprsNode(setExpr, suffix);
	}

	@Override
	public SQLSyntaxTreeNode visitSetExprSuffix(MySQLParser.SetExprSuffixContext ctx) {
		return this.visitSetExprs(ctx.setExprs());
	}

	@Override
	public SQLSyntaxTreeNode visitSetExpr(MySQLParser.SetExprContext ctx) {
		ElementNode left = (ElementNode) this.visitElement(ctx.left);
		ElementNode right = ctx.right != null ? (ElementNode) this.visitElement(ctx.right) : null;
		return new SetExprNode(left, right);
	}

	@Override
	public SQLSyntaxTreeNode visitUpdateSingleTable(MySQLParser.UpdateSingleTableContext ctx) {
		TableNameAndAliasNode tableNameAndAlias = (TableNameAndAliasNode) this.visitTableNameAndAlias(ctx.tableNameAndAlias());
		SetExprsNode setExprs = (SetExprsNode) this.visitSetExprs(ctx.setExprs());
		WhereConditionNode whereCondition = ctx.whereCondition() != null ? (WhereConditionNode) this.visitWhereCondition(ctx.whereCondition()) : null;
		String rowCount = ctx.rowCount != null ? ctx.rowCount.getText() : null;
		return new UpdateSignleTableNode(tableNameAndAlias, setExprs, whereCondition, rowCount);
	}

	@Override
	public SQLSyntaxTreeNode visitUpdateMultipleTable(MySQLParser.UpdateMultipleTableContext ctx) {
		TableNameAndAliasesNode tableNameAndAliases = (TableNameAndAliasesNode) this.visitTableNameAndAliases(ctx.tableNameAndAliases());
		SetExprsNode setExprs = (SetExprsNode) this.visitSetExprs(ctx.setExprs());
		WhereConditionNode whereCondition = ctx.whereCondition() != null ? (WhereConditionNode) this.visitWhereCondition(ctx.whereCondition()) : null;
		return new UpdateMultipleTableNode(tableNameAndAliases, setExprs, whereCondition);
	}

	@Override
	public SQLSyntaxTreeNode visitFunCall(MySQLParser.FunCallContext ctx) {
		String name = ctx.funName.getText();
		ParamListNode paramList = (ParamListNode) this.visitParamList(ctx.paramList());
		return new FunCallNode(name, paramList);
	}

	@Override
	public SQLSyntaxTreeNode visitParamList(MySQLParser.ParamListContext ctx) {
		ElementNode param = (ElementNode) this.visitElement(ctx.param);
		ParamListNode suffix = ctx.paramSuffix() == null ? null : (ParamListNode) this.visitParamSuffix(ctx.paramSuffix());
		return new ParamListNode(param, suffix);
	}

	@Override
	public SQLSyntaxTreeNode visitParamSuffix(MySQLParser.ParamSuffixContext ctx) {
		return visitParamList(ctx.paramList());
	}

	@Override
	public SQLSyntaxTreeNode visitSelectStat(MySQLParser.SelectStatContext ctx) {
		boolean distinct = ctx.distinct != null;
		SelectExprsNode selectExprs = (SelectExprsNode) this.visitSelectExprs(ctx.selectExprs());
		TablesNode tables = null;
		WhereConditionNode where = null;
		GbobExprsNode groupByExprs = null;
		WhereConditionNode having = null;
		GbobExprsNode orderByExprs = null;
		String offset = null;
		String rowCount = null;
		boolean forUpdate = ctx.lock != null;
		if (ctx.tables() != null)
			tables = (TablesNode) this.visitTables(ctx.tables());
		if (ctx.where != null)
			where = (WhereConditionNode) this.visitWhereCondition(ctx.where);
		if (ctx.groupByExprs != null)
			groupByExprs = (GbobExprsNode) this.visitGbobExprs(ctx.groupByExprs);
		if (ctx.having != null)
			having = (WhereConditionNode) this.visitWhereCondition(ctx.having);
		if (ctx.orderByExprs != null)
			orderByExprs = (GbobExprsNode) this.visitGbobExprs(ctx.orderByExprs);
		if (ctx.rowCount != null) {
			rowCount = ctx.rowCount.getText();
			if (ctx.offset != null)
				offset = ctx.offset.getText();
		}

		return new SelectNode(distinct, selectExprs, tables, where, groupByExprs, having, orderByExprs, offset, rowCount, forUpdate);
	}

	@Override
	public SQLSyntaxTreeNode visitSelectExprs(MySQLParser.SelectExprsContext ctx) {
		ElementNode element = (ElementNode) this.visitElement(ctx.element());
		String alias = ctx.alias == null ? null : ctx.alias.getText();
		SelectExprsNode suffix = ctx.selectExprsSuffix() != null ? (SelectExprsNode) this.visitSelectExprsSuffix(ctx.selectExprsSuffix()) : null;
		return new SelectExprsNode(element, alias, suffix);
	}

	@Override
	public SQLSyntaxTreeNode visitSelectExprsSuffix(MySQLParser.SelectExprsSuffixContext ctx) {
		return this.visitSelectExprs(ctx.selectExprs());
	}

	@Override
	public SQLSyntaxTreeNode visitGbobExprs(MySQLParser.GbobExprsContext ctx) {
		ElementNode element = (ElementNode) this.visitElement(ctx.element());
		String sc = ctx.sc == null ? null : ctx.sc.getText();
		GbobExprsNode suffix = (ctx.gbobExprSuffix() != null) ? (GbobExprsNode) this.visitGbobExprSuffix(ctx.gbobExprSuffix()) : null;
		return new GbobExprsNode(element, sc, suffix);
	}

	@Override
	public SQLSyntaxTreeNode visitGbobExprSuffix(MySQLParser.GbobExprSuffixContext ctx) {
		return this.visitGbobExprs(ctx.gbobExprs());
	}

	@Override
	public SQLSyntaxTreeNode visitTables(MySQLParser.TablesContext ctx) {
		TableRelNode tableRel = (TableRelNode) this.visitTableRel(ctx.tableRel());
		TablesNode suffix = ctx.tableSuffix() != null ? (TablesNode) this.visitTableSuffix(ctx.tableSuffix()) : null;
		return new TablesNode(tableRel, suffix);
	}

	@Override
	public SQLSyntaxTreeNode visitTableSuffix(MySQLParser.TableSuffixContext ctx) {
		return this.visitTables(ctx.tables());
	}

	@Override
	public SQLSyntaxTreeNode visitTableSubQuery(MySQLParser.TableSubQueryContext ctx) {
		SelectNode select = (SelectNode) this.visitSelectStat(ctx.selectStat());
		String alias = ctx.alias.getText();
		return new TableSubQueryNode(select, alias);
	}

	@Override
	public SQLSyntaxTreeNode visitTableRecu(MySQLParser.TableRecuContext ctx) {
		TableRelNode tableRel = (TableRelNode) this.visitTableRel(ctx.tableRel());
		return new TableRecuNode(tableRel);
	}

	@Override
	public SQLSyntaxTreeNode visitTableJoin(MySQLParser.TableJoinContext ctx) {
		TableNameAndAliasNode table = (TableNameAndAliasNode) this.visitTableNameAndAlias(ctx.tableNameAndAlias());
		TableJoinSuffixNode suffix = (TableJoinSuffixNode) this.visitTableJoinSuffix(ctx.tableJoinSuffix());
		return new TableJoinNode(table, suffix);
	}

	@Override
	public SQLSyntaxTreeNode visitTableJoinSuffix(MySQLParser.TableJoinSuffixContext ctx) {
		String tableJoinMod = ctx.tableJoinMod().children.stream().map(a -> a.getText()).collect(Collectors.joining(" "));
		TableNameAndAliasNode table = (TableNameAndAliasNode) this.visitTableNameAndAlias(ctx.tableNameAndAlias());
		JoinConditionNode condition = (JoinConditionNode) this.visitJoinCondition(ctx.joinCondition());
		TableJoinSuffixNode suffix = ctx.tableJoinSuffix() == null ? null : (TableJoinSuffixNode) this.visitTableJoinSuffix(ctx.tableJoinSuffix());

		return new TableJoinSuffixNode(tableJoinMod, table, condition, suffix);
	}

	@Override
	public SQLSyntaxTreeNode visitJoinCondition(MySQLParser.JoinConditionContext ctx) {
		WhereConditionNode on = ctx.whereCondition() != null ? (WhereConditionNode) this.visitWhereCondition(ctx.whereCondition()) : null;
		ColumnNamesNode columnNames = ctx.columnNames() != null ? (ColumnNamesNode) this.visitColumnNames(ctx.columnNames()) : null;
		return new JoinConditionNode(on, columnNames);
	}

}
