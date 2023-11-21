package net.yeah.zhouyou.mickey.mysql.tree;

public class SelectExprsNode extends SQLSyntaxTreeNode {
	private ElementNode element;
	private String alias;
	private SelectExprsNode suffix;

	public SelectExprsNode(ElementNode element, String alias, SelectExprsNode suffix) {
		this.element = element;
		this.alias = alias;
		this.suffix = suffix;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append(element);
		if (alias != null)
			sb.append(" as ").append(alias);
		if (suffix != null)
			sb.append(", ").append(suffix);

		return sb.toString();
	}

	public SelectExprsNode getLastNode() {
		return suffix == null ? this : suffix.getLastNode();
	}

	public SelectExprsNode getSuffix() {
		return suffix;
	}

	public void setSuffix(SelectExprsNode suffix) {
		this.suffix = suffix;
	}

}
