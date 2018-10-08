package example1.factory.impl;

import example1.factory.TVFactory;
import example1.product.TV;
import example1.product.impl.HaierTV;

/**
 * 具体的产品工厂
 * 
 * @author wuzz
 * @date 2018年10月8日 上午11:49:16
 */
public class HaierTVFactory implements TVFactory {
	@Override
	public TV produceTV() {
		System.out.println("海尔电视机工厂生产海尔电视机。");
		return new HaierTV();
	}
}