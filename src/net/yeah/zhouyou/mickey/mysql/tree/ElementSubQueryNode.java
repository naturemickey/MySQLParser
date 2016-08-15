package net.yeah.zhouyou.mickey.mysql.tree;

public class ElementSubQueryNode extends ElementNode {
	private SelectNode select;

	public ElementSubQueryNode(SelectNode select) {
		this.select = select;
	}

	@Override
	public String toString() {
		return "(" + select + ")";
	}
}
