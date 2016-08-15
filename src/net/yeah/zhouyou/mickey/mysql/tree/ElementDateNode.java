package net.yeah.zhouyou.mickey.mysql.tree;

public class ElementDateNode extends ElementNode {

	private String str;

	public ElementDateNode(String str) {
		this.str = str;
	}

	@Override
	public String toString() {
		return "date " + str;
	}
}
