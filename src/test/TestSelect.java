package test;

import java.io.IOException;

public class TestSelect {
	public static void main(String[] args) throws Exception {

		for (String sql : new String[] {
				"select this_.id as id1_14_0_, this_.bind_opr_desc as bind_opr2_14_0_, this_.bind_opr_result as bind_opr3_14_0_, this_.bind_tm as bind_tm4_14_0_, this_.create_tm as create_t5_14_0_, this_.dest_number as dest_num6_14_0_, this_.dest_origin_number as dest_ori7_14_0_, this_.is_valid as is_valid8_14_0_, this_.reserved_bind_tm as reserved9_14_0_, this_.reserved_unbind_tm as reserve10_14_0_, this_.src_number as src_num11_14_0_, this_.src_origin_number as src_ori12_14_0_, this_.task_id as task_id13_14_0_, this_.unbind_opr_desc as unbind_14_14_0_, this_.unbind_opr_result as unbind_15_14_0_, this_.unbind_tm as unbind_16_14_0_, this_.virt_number as virt_nu17_14_0_ from tt_number_bind this_ where this_.task_id=?",
				"select a, b from tab1, tab2 t where x = y", //
				"select a, b from ta left outer join tb on x = y where n1=n2 and (n3=n4) and n5=n6", //
				"select a, (select x from tab1 where id = t.y) as xx, b from tab2 t left outer join tab3 using(c,d), (select * from tab5) t5 where t.m = ? and exists (select 1 from tab4 t4 where t1.n  = t4.n)",
				"select 1,2,3 from a limit 5, 10" }) {
			fun(sql);
		}

	}

	private static void fun(String sql) throws IOException {
		SqlTestUtils.test(sql);
	}
}
// select a, (select x from tab1 where id = t.y) as xx, b from tab2 t left outer
// join tab3 using(c,d) where t.m = ? and exists (select 1 from tab4 t4 where
// t1.n = t4.n)
