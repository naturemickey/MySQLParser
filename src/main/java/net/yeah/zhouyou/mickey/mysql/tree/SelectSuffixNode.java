package net.yeah.zhouyou.mickey.mysql.tree;

public class SelectSuffixNode extends SQLSyntaxTreeNode {

	private GbobExprsNode orderByExprs;
	private String offset;
	private String rowCount;
	private String lock;
	private boolean hasOffsetWord;

	public SelectSuffixNode(GbobExprsNode orderByExprs, String offset, String rowCount, String lock,
			boolean hasOffsetWord) {
		this.orderByExprs = orderByExprs;
		this.offset = offset;
		this.rowCount = rowCount;
		this.lock = lock;
		this.hasOffsetWord = hasOffsetWord;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		if (this.orderByExprs != null)
			sb.append(" order by ").append(this.orderByExprs);
		if (this.rowCount != null) {
			sb.append(" limit ");
			if (this.hasOffsetWord) {
				sb.append(this.rowCount).append(" offset ").append(this.offset);
			} else {
				if (this.offset != null)
					sb.append(this.offset).append(", ");
				sb.append(this.rowCount);
			}
		}
		if (this.lock != null) {
			sb.append(' ').append(this.lock);
		}

		return sb.toString();
	}

	public String getOffset() {
		return offset;
	}

	public String getRowCount() {
		return rowCount;
	}

	public void setOffset(String offset) {
		this.offset = offset;
	}

	public void setRowCount(String rowCount) {
		this.rowCount = rowCount;
	}

}
