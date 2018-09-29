package example4;

public class Client {
	public static void main(String[] args) {
		Car car = new Car();
		CarLogProxy carLogProxy = new CarLogProxy(car);
		CarTimeProxy carTimeProxy = new CarTimeProxy(carLogProxy);
		carTimeProxy.run();
	}
}
