package example2.Strategy.ConcreteStrategy;

import example2.Strategy.TravelStrategy;

public class BicycleTravelStrategy implements TravelStrategy {

	@Override
	public void travelMethod() {
		System.out.println("自行车游！");
	}
}
