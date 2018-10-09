package example2.Strategy.ConcreteStrategy;

import example2.Strategy.TravelStrategy;

public class SelfTravelStrategy implements TravelStrategy {

	@Override
	public void travelMethod() {
		System.out.println("自驾游！");
	}
}
