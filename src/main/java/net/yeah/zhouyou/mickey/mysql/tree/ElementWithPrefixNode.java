package net.yeah.zhouyou.mickey.mysql.tree;

public class ElementWithPrefixNode extends ElementOpFactoryNode {

	private String prefix;
	private ElementOpFactoryNode elementOpFactory;

	public ElementWithPrefixNode(String prefix, ElementOpFactoryNode elementOpFactory) {
		this.prefix = prefix.toLowerCase();
		this.elementOpFactory = elementOpFactory;
	}

	@Override
	public String toString() {
		return prefix + " " + elementOpFactory;
	}

}
