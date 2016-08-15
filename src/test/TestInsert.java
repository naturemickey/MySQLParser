package test;

public class TestInsert {
	public static void main(String[] args) throws Exception {

		String sql = "InSeRt taba(abc_1,str1,str2, create_tiMe,n,ph1,ph2) \nVALUES(?,'a\"b''c',\"a'\"\"b\",current_timestamp,nUlL,:1,:ph2)";

		SqlTestUtils.test(sql);
		

		 sql = "insert into tab (a, b, c) select 1, 2, 3";

		SqlTestUtils.test(sql);

	}
}
