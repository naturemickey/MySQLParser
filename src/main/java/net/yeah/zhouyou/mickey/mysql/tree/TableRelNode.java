package net.yeah.zhouyou.mickey.mysql.tree;

import java.util.List;

public abstract class TableRelNode extends SQLSyntaxTreeNode {

	public abstract List<TableAndJoinMod> getRealTables();

	public static class TableAndJoinMod {
		private TableNameAndAliasNode tableNameAndAliasNode;
		private String tableJoinMod;

		public TableAndJoinMod(TableNameAndAliasNode tableNameAndAliasNode) {
			this.tableNameAndAliasNode = tableNameAndAliasNode;
		}

		public TableAndJoinMod(TableNameAndAliasNode tableNameAndAliasNode, String tableJoinMod) {
			this.tableNameAndAliasNode = tableNameAndAliasNode;
			this.tableJoinMod = tableJoinMod;
		}

		public TableNameAndAliasNode getTableNameAndAliasNode() {
			return tableNameAndAliasNode;
		}

		public String getTableJoinMod() {
			return tableJoinMod;
		}
	}

}
