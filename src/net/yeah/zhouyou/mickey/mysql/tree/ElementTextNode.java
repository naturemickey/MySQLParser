package net.yeah.zhouyou.mickey.mysql.tree;

public class ElementTextNode extends ElementNode {

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

}
