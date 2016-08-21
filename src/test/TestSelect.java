package test;

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
				"SELECT 38.8, CAST(38.8 AS CHAR), x'0a0e', 0xabc, X'0a0e', 0Xabc, b'1010', 0B1010", //
				"SELECT * FROM t1 WHERE (col1,col2) = (SELECT col3, col4 FROM t2 WHERE id = 10)", //
				"SELECT * FROM t1 WHERE ROW(col1,col2) = ANY (SELECT col3, col4 FROM t2 WHERE id = 10)", //
				"select distinct c1, c2 from t1 where (c1, c2) = (1, 2) lock in Share Mode", //
				"select (select column1 from t1) + 5 from t2 FOR UPDATE", //
				"select 1 as a union all select x from t left join t1 on t.a = t1.b union select 'x' from t2 where x is UNKNOWN", //
				"select sum(a) from tab1 t1, tab2 t2 where t1.id = t2.id group by t1.a, t2.b having count(*) > 1 order by t1.id DESC, t2.id asc",
				// "select 1 from t for updat",//
				"SELECT b+0, BIN(b+0), OCT(b+0), HEX(b+0) FROM t", //
				"CommIt", "RollbaCk", //
				 "SELECT * FROM t1 LEFT JOIN (t2, t3, t4)ON (t2.a=t1.a AND t3.b=t1.b AND t4.c=t1.c)",

				// "SELECT * FROM t1 LEFT JOIN (t2 CROSS JOIN t3 CROSS JOIN t4)
				// ON (t2.a=t1.a AND t3.b=t1.b AND t4.c=t1.c)",//
				"SELECT t1.name, t2.salary FROM employee AS t1 INNER JOIN info AS t2 ON t1.name = t2.name", //
				"SELECT REPEAT('a',1) UNION SELECT REPEAT('b',10)", //
				 "(SELECT a FROM t1 WHERE a=10 AND B=1) UNION (SELECT a FROM t2 WHERE a=11 AND B=2) ORDER BY a LIMIT 10", //
				"SELECT 1 AS foo UNION SELECT 2 ORDER BY MAX(1)", //
				"SELECT 1 /* this is an in-line comment */ + 1", //
				
				 "SELECT 102/(1-1)", //
				"SELECT CONV(10+'10'+'10'+X'0a',10,10),IF(1>2,2,3),COS(PI() / 2)", //
				 "SELECT CASE WHEN 1>0 THEN 'true' ELSE 'false' END", //
				 "SELECT CASE 1 WHEN 1 THEN 'one' WHEN 2 THEN 'two' ELSE 'more' END", //
//				"SELECT CASE BINARY 'B' WHEN 'a' THEN 1 WHEN 'b' THEN 2 END", //
		}) {
			SqlTestUtils.test(sql);
		}

	}
}
