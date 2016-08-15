package test;

import java.io.IOException;

public class TestDelete {
	public static void main(String[] args) throws Exception {

		for (String sql : new String[] { "delete from tt_order_status where id = ?", "delete from tt_order_status t where t.id = ?",
				"delete from tt_order_status as t",
				"delete from tt_order_status lImIt 9"}) {
			fun(sql);
		}

	}

	private static void fun(String sql) throws IOException {
		SqlTestUtils.test(sql);}
}
