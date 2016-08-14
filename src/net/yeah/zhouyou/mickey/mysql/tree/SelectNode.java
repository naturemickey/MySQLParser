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

}
