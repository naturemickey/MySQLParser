package net.yeah.zhouyou.mickey.mysql.tree;

public class ElementDateNode extends ElementOpFactoryNode {
	private String dt;
	private String str;

	public ElementDateNode(String dt, String str) {
		this.dt = dt.toLowerCase();
		this.str = str;
	}

	@Override
	public String toString() {
		return dt + ' ' + str;
	}
}
