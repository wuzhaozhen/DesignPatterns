package example2.Strategy.ConcreteStrategy;

import example2.Strategy.TravelStrategy;

/**
 * 具体策略类
 * 
 * @author wuzz
 * @date 2018年10月9日 下午1:21:41
 */
public class AirplaneStrategy implements TravelStrategy {
	
	@Override
	public void travelMethod() {
		System.out.println("飞机游！");
	}
}
