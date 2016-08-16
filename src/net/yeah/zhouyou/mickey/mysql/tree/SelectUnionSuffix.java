package net.yeah.zhouyou.mickey.mysql.tree;

public class SelectUnionSuffix extends SQLSyntaxTreeNode {
	private String method;
	private SelectNode select;

	public SelectUnionSuffix(String method, SelectNode select) {
		this.method = method;
		this.select = select;
	}

	@Override
	public String toString() {
		if (method == null) {
			return "union " + select;
		} else {
			return "union " + method + ' ' + select;
		}
	}
}
