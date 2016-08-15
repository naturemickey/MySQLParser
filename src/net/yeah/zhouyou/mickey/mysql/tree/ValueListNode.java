package net.yeah.zhouyou.mickey.mysql.tree;

public class ValueListNode extends SQLSyntaxTreeNode {

	private String name;
	private ValueListNode suffix;

	public ValueListNode(String name, ValueListNode suffix) {
		this.name = name;
		this.suffix = suffix;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(name);
		if (suffix != null) {
			sb.append(", ");
			sb.append(suffix.toString());
		}
		return sb.toString();
	}
	
	public ValueListNode getLastNode() {
		if (suffix == null)
			return this;
		return suffix.getLastNode();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ValueListNode getSuffix() {
		return suffix;
	}

	public void setSuffix(ValueListNode suffix) {
		this.suffix = suffix;
	}

}
