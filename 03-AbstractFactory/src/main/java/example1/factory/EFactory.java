package example1.factory;

import example1.product.AirConditioner;
import example1.product.Television;

/**
 * 抽象电器工厂
 * 
 * @author wuzz
 * @date 2018年10月8日 下午1:05:46
 */
public interface EFactory {
	public Television produceTelevision();

	public AirConditioner produceAirConditioner();
}