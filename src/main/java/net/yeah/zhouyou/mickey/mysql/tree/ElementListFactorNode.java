package net.yeah.zhouyou.mickey.mysql.tree;

public class ElementListFactorNode extends ElementNode {
	private ElementListNode elementList;

	public ElementListFactorNode(ElementListNode elementList) {
		this.elementList = elementList;
	}

	@Override
	public String toString() {
		return "(" + elementList + ")";
	}
}
