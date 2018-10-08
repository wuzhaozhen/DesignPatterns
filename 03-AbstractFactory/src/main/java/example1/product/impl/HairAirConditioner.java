package example1.product.impl;

import example1.product.AirConditioner;
/**
 * 具体的产品
 * 
 * @author wuzz
 * @date 2018年10月8日 上午11:59:41
 */
public class HairAirConditioner implements AirConditioner {

	@Override
	public void changeTemperature() {
		System.out.println("海尔空调温度改变中......");
	}
}