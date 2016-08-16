package net.yeah.zhouyou.mickey.mysql.tree;

public class ElementDateNode extends ElementOpFactoryNode {

	private String str;

	public ElementDateNode(String str) {
		this.str = str;
	}

	@Override
	public String toString() {
		return "date " + str;
	}
}
