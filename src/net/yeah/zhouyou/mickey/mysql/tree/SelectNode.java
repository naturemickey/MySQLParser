package net.yeah.zhouyou.mickey.mysql.tree;

public class SelectNode extends SQLSyntaxTreeNode {

	private boolean distinct;
	private SelectExprsNode selectExprs;
	private TablesNode tables;
	private WhereConditionNode where;
	private GbobExprsNode groupByExprs;
	private WhereConditionNode having;
	private GbobExprsNode orderByExprs;
	private String offset;
	private String rowCount;
	private boolean forUpdate;

	public SelectNode(boolean distinct, SelectExprsNode selectExprs, TablesNode tables, WhereConditionNode where, GbobExprsNode groupByExprs,
			WhereConditionNode having, GbobExprsNode orderByExprs, String offset, String rowCount, boolean forUpdate) {
		this.distinct = distinct;
		this.selectExprs = selectExprs;
		this.tables = tables;
		this.where = where;
		this.groupByExprs = groupByExprs;
		this.having = having;
		this.orderByExprs = orderByExprs;
		this.offset = offset;
		this.rowCount = rowCount;
		this.forUpdate = forUpdate;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("select ");
		if (this.distinct)
			sb.append("distinct ");
		sb.append(this.selectExprs.toString());
		if (this.tables != null)
			sb.append(" from ").append(this.tables);
		if (this.where != null)
			sb.append(" where ").append(this.where);
		if (this.groupByExprs != null)
			sb.append(" group by ").append(this.groupByExprs);
		if (this.having != null)
			sb.append(" having ").append(this.having);
		if (this.orderByExprs != null)
			sb.append(" order by ").append(this.orderByExprs);
		if (this.rowCount != null) {
			sb.append(" limit ");
			sb.append(this.rowCount);
			if (this.offset != null)
				sb.append(" offset ").append(this.offset);
		}
		if (this.forUpdate)
			sb.append(" for update");

		return sb.toString();
	}

	public boolean isDistinct() {
		return distinct;
	}

	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	public SelectExprsNode getSelectExprs() {
		return selectExprs;
	}

	public void setSelectExprs(SelectExprsNode selectExprs) {
		this.selectExprs = selectExprs;
	}

	public TablesNode getTables() {
		return tables;
	}

	public void setTables(TablesNode tables) {
		this.tables = tables;
	}

	public WhereConditionNode getWhere() {
		return where;
	}

	public void setWhere(WhereConditionNode where) {
		this.where = where;
	}

	public GbobExprsNode getGroupByExprs() {
		return groupByExprs;
	}

	public void setGroupByExprs(GbobExprsNode groupByExprs) {
		this.groupByExprs = groupByExprs;
	}

	public WhereConditionNode getHaving() {
		return having;
	}

	public void setHaving(WhereConditionNode having) {
		this.having = having;
	}

	public GbobExprsNode getOrderByExprs() {
		return orderByExprs;
	}

	public void setOrderByExprs(GbobExprsNode orderByExprs) {
		this.orderByExprs = orderByExprs;
	}

	public String getOffset() {
		return offset;
	}

	public void setOffset(String offset) {
		this.offset = offset;
	}

	public String getRowCount() {
		return rowCount;
	}

	public void setRowCount(String rowCount) {
		this.rowCount = rowCount;
	}

	public boolean isForUpdate() {
		return forUpdate;
	}

	public void setForUpdate(boolean forUpdate) {
		this.forUpdate = forUpdate;
	}

}
