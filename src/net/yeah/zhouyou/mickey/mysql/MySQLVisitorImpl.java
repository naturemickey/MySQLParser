package net.yeah.zhouyou.mickey.mysql;

import net.yeah.zhouyou.mickey.mysql.antlr4.MySQLBaseVisitor;
import net.yeah.zhouyou.mickey.mysql.antlr4.MySQLParser;
import net.yeah.zhouyou.mickey.mysql.tree.ColumnNamesNode;
import net.yeah.zhouyou.mickey.mysql.tree.DeleteNode;
import net.yeah.zhouyou.mickey.mysql.tree.ElementNode;
import net.yeah.zhouyou.mickey.mysql.tree.ExpressionBetweenAndNode;
import net.yeah.zhouyou.mickey.mysql.tree.ExpressionExistsNode;
import net.yeah.zhouyou.mickey.mysql.tree.ExpressionInSelectNode;
import net.yeah.zhouyou.mickey.mysql.tree.ExpressionInValuesNode;
import net.yeah.zhouyou.mickey.mysql.tree.ExpressionIsOrIsNotNode;
import net.yeah.zhouyou.mickey.mysql.tree.ExpressionNode;
import net.yeah.zhouyou.mickey.mysql.tree.ExpressionNotNode;
import net.yeah.zhouyou.mickey.mysql.tree.ExpressionRelationalNode;
import net.yeah.zhouyou.mickey.mysql.tree.InsertNode;
import net.yeah.zhouyou.mickey.mysql.tree.SQLSyntaxTreeNode;
import net.yeah.zhouyou.mickey.mysql.tree.SelectNode;
import net.yeah.zhouyou.mickey.mysql.tree.TableNameAndAliasNode;
import net.yeah.zhouyou.mickey.mysql.tree.ValueListNode;
import net.yeah.zhouyou.mickey.mysql.tree.WhereConditionNode;
import net.yeah.zhouyou.mickey.mysql.tree.WhereConditionOpNode;
import net.yeah.zhouyou.mickey.mysql.tree.WhereConditionSubNode;

public class MySQLVisitorImpl extends MySQLBaseVisitor<SQLSyntaxTreeNode> {

	@Override
	public SQLSyntaxTreeNode visitInsertStat(MySQLParser.InsertStatContext ctx) {
		String tableName = ctx.tableName.getText();
		ColumnNamesNode columnNames = (ColumnNamesNode) visitColumnNames(ctx.columnNames());
		ValueListNode valueNames = (ValueListNode) visitValueList(ctx.valueList());

		return new InsertNode(tableName, columnNames, valueNames);
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
	public SQLSyntaxTreeNode visitWhereCondSub(MySQLParser.WhereCondSubContext ctx) {
		return new WhereConditionSubNode((WhereConditionNode) this.visitWhereCondition(ctx.whereCondition()));
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
		return new ExpressionBetweenAndNode(element, left, right);
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
		SelectNode select = (SelectNode) this.visitSelectStat(ctx.selectStat());
		return new ExpressionInSelectNode(element, select);
	}

	@Override
	public SQLSyntaxTreeNode visitExprInValues(MySQLParser.ExprInValuesContext ctx) {
		ElementNode element = (ElementNode) this.visitElement(ctx.element());
		ValueListNode values = (ValueListNode) this.visitValueList(ctx.valueList());
		return new ExpressionInValuesNode(element, values);
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

	@Override
	public SQLSyntaxTreeNode visitElement(MySQLParser.ElementContext ctx) {
		return new ElementNode(ctx.getChild(0).getText());
	}

}
