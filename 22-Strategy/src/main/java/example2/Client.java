package example2;

public class Client {
	public static void main(String args[]) {
		MyContext mc = new MyContext((TravelStrategy) XMLUtil.getBean());
		mc.travelMethod();
	}
}
