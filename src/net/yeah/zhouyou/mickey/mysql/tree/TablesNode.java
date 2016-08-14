package net.yeah.zhouyou.mickey.mysql.tree;

public class TablesNode extends SQLSyntaxTreeNode {

	private TableRelNode tableRel;
	private TablesNode suffix;

	public TablesNode(TableRelNode tableRel, TablesNode suffix) {
		this.tableRel = tableRel;
		this.suffix = suffix;
	}

	@Override
	public String toString() {
		if (suffix == null)
			return tableRel.toString();
		return tableRel + ", " + suffix;
	}
}
