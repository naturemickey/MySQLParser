package net.yeah.zhouyou.mickey.mysql.tree;

public class ElementNode extends SQLSyntaxTreeNode {
	private String txt;

	public ElementNode(String txt) {
		this.txt = txt;
	}

	@Override
	public String toString() {
		return txt;
	}
}
