package net.yeah.zhouyou.mickey.mysql.tree;

public class TableSubQueryNode extends TableRelNode {

	private SelectNode select;
	private String alias;

	public TableSubQueryNode(SelectNode select, String alias) {
		this.select = select;
		this.alias = alias;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append('(').append(select).append(')').append(alias);
		return sb.toString();
	}
}
