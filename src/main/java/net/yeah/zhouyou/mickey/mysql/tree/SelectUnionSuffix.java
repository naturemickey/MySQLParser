package net.yeah.zhouyou.mickey.mysql.tree;

public class SelectUnionSuffix extends SQLSyntaxTreeNode {
	private String method;
	private SelectNode select;
	private SelectSuffixNode suffix;

	public SelectUnionSuffix(String method, SelectNode select, SelectSuffixNode suffix) {
		this.method = method;
		this.select = select;
		this.suffix = suffix;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("union ");
		if (method != null) {
			sb.append(method).append(' ');
		}
		sb.append("(").append(select).append(")");
		if (suffix != null) {
			sb.append(' ').append(suffix);
		}
		return sb.toString();
	}
}
