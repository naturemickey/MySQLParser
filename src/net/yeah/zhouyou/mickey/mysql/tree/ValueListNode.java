package net.yeah.zhouyou.mickey.mysql.tree;

public class ValueListNode extends SQLSyntaxTreeNode {

	private ElementNode element;
	private ValueListNode suffix;

	public ValueListNode(ElementNode element, ValueListNode suffix) {
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

	public ValueListNode getLastNode() {
		if (suffix == null)
			return this;
		return suffix.getLastNode();
	}

	public ValueListNode getSuffix() {
		return suffix;
	}

	public void setSuffix(ValueListNode suffix) {
		this.suffix = suffix;
	}

}
