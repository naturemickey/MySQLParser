package net.yeah.zhouyou.mickey.mysql.tree;

public class ElementWapperBktNode extends ElementOpFactoryNode {

	private ElementNode element;

	public ElementWapperBktNode(ElementNode element) {
		this.element = element;
	}

	@Override
	public String toString() {
		return "(" + element + ")";
	}

}
