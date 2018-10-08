package example1.factory.impl;

import example1.factory.EFactory;
import example1.product.AirConditioner;
import example1.product.Television;
import example1.product.impl.TCLAirConditioner;
import example1.product.impl.TCLTelevision;

/**
 * 具体的工厂类
 * 
 * @author wuzz
 * @date 2018年10月8日 下午1:06:10
 */
public class TCLFactory implements EFactory {

	@Override
	public Television produceTelevision() {
		return new TCLTelevision();
	}

	@Override
	public AirConditioner produceAirConditioner() {
		return new TCLAirConditioner();
	}
}