package net.yeah.zhouyou.mickey.mysql.tree;

public class JoinConditionNode extends SQLSyntaxTreeNode {

	private WhereConditionNode on;
	private ColumnNamesNode columnNames;

	public JoinConditionNode(WhereConditionNode on, ColumnNamesNode columnNames) {
		this.on = on;
		this.columnNames = columnNames;
	}

	@Override
	public String toString() {
		if (on != null)
			return "on " + on;
		return "using (" + columnNames + ')';
	}

}
