package net.yeah.zhouyou.mickey.mysql.tree;

public class SelectNode extends SQLSyntaxTreeNode {
	private SelectInner selectInner;
	private SelectUnionSuffix suffix;

	public SelectNode(SelectInner selectInner, SelectUnionSuffix suffix) {
		this.selectInner = selectInner;
		this.suffix = suffix;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		if (suffix != null) {
			sb.append('(').append(selectInner).append(')').append(' ').append(suffix);
		} else {
			sb.append(selectInner);
		}
		return sb.toString();
	}

	public SelectInner getSelectInner() {
		return selectInner;
	}

	public void setSelectInner(SelectInner selectInner) {
		this.selectInner = selectInner;
	}

	public SelectUnionSuffix getSuffix() {
		return suffix;
	}

	public void setSuffix(SelectUnionSuffix suffix) {
		this.suffix = suffix;
	}

}
