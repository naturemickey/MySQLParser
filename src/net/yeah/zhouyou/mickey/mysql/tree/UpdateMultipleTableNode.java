package net.yeah.zhouyou.mickey.mysql.tree;

public class UpdateMultipleTableNode extends SQLSyntaxTreeNode {

	private TableNameAndAliasesNode tableNameAndAliases;
	private SetExprsNode setExprs;
	private WhereConditionNode whereCondition;

	public UpdateMultipleTableNode(TableNameAndAliasesNode tableNameAndAliases, SetExprsNode setExprs, WhereConditionNode whereCondition) {
		this.tableNameAndAliases = tableNameAndAliases;
		this.setExprs = setExprs;
		this.whereCondition = whereCondition;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("update ").append(this.tableNameAndAliases).append(" SET ").append(this.setExprs.toString());
		if (this.whereCondition != null) {
			sb.append(" where ").append(this.whereCondition.toString());
		}

		return sb.toString();
	}
}
