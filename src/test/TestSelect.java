package test;

import java.io.IOException;

public class TestSelect {
	public static void main(String[] args) throws Exception {

		for (String sql : new String[] {
				"select this_.id as id1_14_0_, this_.bind_opr_desc as bind_opr2_14_0_, this_.bind_opr_result as bind_opr3_14_0_, this_.bind_tm as bind_tm4_14_0_, this_.create_tm as create_t5_14_0_, this_.dest_number as dest_num6_14_0_, this_.dest_origin_number as dest_ori7_14_0_, this_.is_valid as is_valid8_14_0_, this_.reserved_bind_tm as reserved9_14_0_, this_.reserved_unbind_tm as reserve10_14_0_, this_.src_number as src_num11_14_0_, this_.src_origin_number as src_ori12_14_0_, this_.task_id as task_id13_14_0_, this_.unbind_opr_desc as unbind_14_14_0_, this_.unbind_opr_result as unbind_15_14_0_, this_.unbind_tm as unbind_16_14_0_, this_.virt_number as virt_nu17_14_0_ from tt_number_bind this_ where this_.task_id=?",
				"select a, b from tab1, tab2 t where x = y", //
				"select a, b from ta left outer join tb on x = y where n1=n2 and (n3=n4) and n5=n6", //
				"select a, (select x from tab1 where id = t.y) as xx, b from tab2 t left outer join tab3 using(c,d), (select * from tab5) t5 where t.m = ? and exists (select 1 from tab4 t4 where t1.n  = t4.n)",
				"select 1,2,38.8 from a limit 5, 10", //
				"select date '2016-08-08', time '10:20:30'", //
				"select a, count(1) from tab where create_tm = date '2016-08-08' group by a order by b desc", //
				"SELECT 38.8, CAST(38.8 AS CHAR), x'0a0e', 0xabc, X'0a0e', 0Xabc", //
				"SELECT * FROM t1 WHERE (col1,col2) = (SELECT col3, col4 FROM t2 WHERE id = 10)", //
				"SELECT * FROM t1 WHERE ROW(col1,col2) = ANY (SELECT col3, col4 FROM t2 WHERE id = 10)", //
				"select distinct c1, c2 from t1 where (c1, c2) = (1, 2)", //
				"select (select column1 from t1) + 5 from t2", //
				"select 1 as a union all select x from t left join t1 on t.a = t1.b union select 'x'"}) {
			fun(sql);
		}

	}

	private static void fun(String sql) throws IOException {
		SqlTestUtils.test(sql);
	}
}
/**
 * select a, (select x from tab1 where id = t.y) as xx, b from tab2 t left outer
 * join tab3 using(c,d), (select * from tab5) t5 where t.m = ? and exists
 * (select 1 from tab4 t4 where t1.n = t4.n)
 */
