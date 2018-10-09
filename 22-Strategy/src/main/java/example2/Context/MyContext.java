package example2.Context;

import example2.Strategy.TravelStrategy;

/**
 * 环境类
 * 
 * @author wuzz
 * @date 2018年10月9日 下午1:20:04
 */
public class MyContext {
	private TravelStrategy ts;

	public MyContext(TravelStrategy ts) {
		this.ts = ts;
	}

	public void travelMethod() {
		ts.travelMethod();
	}
}
