package net.yeah.zhouyou.mickey.mysql.tree;

public class ElementOpEleSuffixNode extends ElementNode {

	private String op;
	private ElementOpEleNode element;

	public ElementOpEleSuffixNode(String op, ElementOpEleNode element) {
		this.op = op;
		this.element = element;
	}

	@Override
	public String toString() {
		return op + ' ' + element;
	}

}
