package net.yeah.zhouyou.mickey.mysql.tree;

public class InsertNode extends SQLSyntaxTreeNode {

	private String tableName;
	private ColumnNamesNode columnNames;
	private ValueListNode valueNames;

	public InsertNode(String tableName, ColumnNamesNode columnNames, ValueListNode valueNames) {
		this.tableName = tableName;
		this.columnNames = columnNames;
		this.valueNames = valueNames;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("insert into ");
		sb.append(tableName);
		if (columnNames != null) {
			sb.append('(').append(columnNames.toString()).append(')');
		}
		sb.append("values(").append(valueNames.toString()).append(')');
		return sb.toString();
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public ColumnNamesNode getColumnNames() {
		return columnNames;
	}

	public void setColumnNames(ColumnNamesNode columnNames) {
		this.columnNames = columnNames;
	}

	public ValueListNode getValueNames() {
		return valueNames;
	}

	public void setValueNames(ValueListNode valueNames) {
		this.valueNames = valueNames;
	}

}
