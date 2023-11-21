package net.yeah.zhouyou.mickey.mysql.tree;

public class ElementTextNode extends ElementOpFactoryNode {

	private String txt;

	public ElementTextNode(String txt) {
		this.txt = txt;
	}

	@Override
	public String toString() {
		return txt;
	}

	public String getTxt() {
		return txt;
	}

	public void setTxt(String txt) {
		this.txt = txt;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((txt == null) ? 0 : txt.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ElementTextNode other = (ElementTextNode) obj;
		if (txt == null) {
			if (other.txt != null)
				return false;
		} else if (!txt.equals(other.txt))
			return false;
		return true;
	}

}
