package net.yeah.zhouyou.mickey.mysql.tree;

public class ElementSubQueryNode extends ElementOpFactoryNode {
	private String with;
	private SelectNode select;

	public ElementSubQueryNode(String with, SelectNode select) {
		this.with = with;
		this.select = select;
	}

	@Override
	public String toString() {
		if (with != null) {
			return with + " (" + select + ")";
		} else {
			return "(" + select + ")";
		}
	}
}
