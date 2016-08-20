package net.yeah.zhouyou.mickey.mysql.tree;

public class SelectInner extends SQLSyntaxTreeNode {

	private SelectPrefixNode prefix;
	private SelectSuffixNode suffix;

	public SelectInner(SelectPrefixNode prefix, SelectSuffixNode suffix) {
		this.prefix = prefix;
		this.suffix = suffix;
	}

	@Override
	public String toString() {
		String suffixStr = suffix == null ? "" : suffix.toString();
		if (suffixStr.length() > 0)
			return prefix + " " + suffix;
		return prefix.toString();
	}

	public SelectPrefixNode getPrefix() {
		return prefix;
	}

	public void setPrefix(SelectPrefixNode prefix) {
		this.prefix = prefix;
	}

	public SelectSuffixNode getSuffix() {
		return suffix;
	}

	public void setSuffix(SelectSuffixNode suffix) {
		this.suffix = suffix;
	}
}
