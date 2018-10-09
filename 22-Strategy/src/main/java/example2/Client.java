package example2;

import example2.Context.MyContext;
import example2.Strategy.ConcreteStrategy.BicycleTravelStrategy;

public class Client {
	public static void main(String args[]) {
		MyContext mc = new MyContext(new BicycleTravelStrategy());
		mc.travelMethod();
	}
}
