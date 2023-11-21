package test;

public class TestOuterJoin {

	public static void main(String[] args) throws Exception {

		for (String sql : new String[] { 
				"select a, b from tab1, tab2 t where (x = y or z = x) and a = b", //
				"select a, b from t1 left outer join t2 on t1.x = t2.y where t1.id = ?" ,//
				"select a, b from t1 t right join t2 on t1.x = t2.y where t1.id = ?",//
				}) {
			SqlTestUtils.test(sql);
		}

	}
}
