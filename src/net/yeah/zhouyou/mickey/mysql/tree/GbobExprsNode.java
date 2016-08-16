package net.yeah.zhouyou.mickey.mysql.tree;

public class GbobExprsNode extends SQLSyntaxTreeNode {
	private ElementNode element;
	private String sc;
	private GbobExprsNode suffix;

	public GbobExprsNode(ElementNode element, String sc, GbobExprsNode suffix) {
		this.element = element;
		if (sc != null)
			this.sc = sc.toLowerCase();
		this.suffix = suffix;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(element);
		if (sc != null)
			sb.append(' ').append(sc);
		if (suffix != null)
			sb.append(", ").append(suffix);
		return sb.toString();
	}

}
