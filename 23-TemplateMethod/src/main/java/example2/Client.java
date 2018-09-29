package example2;

public class Client {
	public static void main(String a[]) {
		DBOperator db1;

		db1 = new DBOperatorSubA();
		db1.process();
		System.out.println("---------------------------------------");
		db1 = new DBOperatorSubB();
		db1.process();
	}
}
