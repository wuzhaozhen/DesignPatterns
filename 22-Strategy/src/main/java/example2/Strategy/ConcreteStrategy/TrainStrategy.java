package example2.Strategy.ConcreteStrategy;

import example2.Strategy.TravelStrategy;

public class TrainStrategy implements TravelStrategy {

	@Override
	public void travelMethod() {
		System.out.println("火车游！");
	}
}