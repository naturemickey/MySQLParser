package net.yeah.zhouyou.mickey.mysql.tree;

public class UpdateMultipleTableNode extends UpdateNode {

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

	public TableNameAndAliasesNode getTableNameAndAliases() {
		return tableNameAndAliases;
	}

	public void setTableNameAndAliases(TableNameAndAliasesNode tableNameAndAliases) {
		this.tableNameAndAliases = tableNameAndAliases;
	}

	public SetExprsNode getSetExprs() {
		return setExprs;
	}

	public void setSetExprs(SetExprsNode setExprs) {
		this.setExprs = setExprs;
	}

	public WhereConditionNode getWhereCondition() {
		return whereCondition;
	}

	public void setWhereCondition(WhereConditionNode whereCondition) {
		this.whereCondition = whereCondition;
	}

}
