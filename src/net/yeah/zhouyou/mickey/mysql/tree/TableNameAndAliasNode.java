package net.yeah.zhouyou.mickey.mysql.tree;

public class TableNameAndAliasNode extends SQLSyntaxTreeNode {

	private String name;
	private String alias;

	public TableNameAndAliasNode(String name, String alias) {
		this.name = name;
		this.alias = alias;
	}

	@Override
	public String toString() {
		return name + ' ' + alias;
	}
}
