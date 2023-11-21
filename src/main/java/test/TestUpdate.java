package test;

import java.io.IOException;

public class TestUpdate {
	public static void main(String[] args) throws Exception {

		for (String sql : new String[] { //
				"update tab x set x.a=?,x.b='a' where id=?", //
				"update tab set a = ?", //
				"update tab1 t1, tab2 set t1.a = ?, b='a' where x=? and y=?", //
				"UPDATE table SET c=b+1 mod 2*5 WHERE not a=1 or x not like 'xyz'"//
		}) {
			fun(sql);
		}

	}

	private static void fun(String sql) throws IOException {
		SqlTestUtils.test(sql);
	}
}
