package net.yeah.zhouyou.mickey.mysql.tree;

public class TableRecuNode extends TableRelNode {

	private TableRelNode tableRel;

	public TableRecuNode(TableRelNode tableRel) {
		this.tableRel = tableRel;
	}

	@Override
	public String toString() {
		return "(" + tableRel + ")";
	}

}
