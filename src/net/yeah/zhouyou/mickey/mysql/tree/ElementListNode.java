package net.yeah.zhouyou.mickey.mysql.tree;

public class ElementListNode extends SQLSyntaxTreeNode {

	private ElementNode element;
	private ElementListNode suffix;

	public ElementListNode(ElementNode element, ElementListNode suffix) {
		this.element = element;
		this.suffix = suffix;
	}

	@Override
	public String toString() {
		if (suffix == null) {
			return element.toString();
		} else {
			return element + ", " + suffix;
		}
	}

}
