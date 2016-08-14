package net.yeah.zhouyou.mickey.mysql.tree;

public class UpdateSignleTableNode extends SQLSyntaxTreeNode {

	private TableNameAndAliasNode tableNameAndAlias;
	private SetExprsNode setExprs;
	private WhereConditionNode whereCondition;
	private String rowCount;

	public UpdateSignleTableNode(TableNameAndAliasNode tableNameAndAlias, SetExprsNode setExprs, WhereConditionNode whereCondition, String rowCount) {
		this.tableNameAndAlias = tableNameAndAlias;
		this.setExprs = setExprs;
		this.whereCondition = whereCondition;
		this.rowCount = rowCount;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("update ").append(this.tableNameAndAlias).append(" SET ").append(this.setExprs.toString());
		if (this.whereCondition != null) {
			sb.append(" where ").append(this.whereCondition.toString());
		}
		if (this.rowCount != null) {
			sb.append(" limit ").append(rowCount);
		}

		return sb.toString();
	}
}
