package net.yeah.zhouyou.mickey.mysql.tree;

public class ColumnNamesNode extends SQLSyntaxTreeNode {

	private String name;
	private ColumnNamesNode suffix;

	public ColumnNamesNode(String name, ColumnNamesNode suffix) {
		this.name = name;
		this.suffix = suffix;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(name);
		if (suffix != null) {
			sb.append(',');
			sb.append(suffix.toString());
		}
		return sb.toString();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ColumnNamesNode getSuffix() {
		return suffix;
	}

	public void setSuffix(ColumnNamesNode suffix) {
		this.suffix = suffix;
	}
	
	
	
}
