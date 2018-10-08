package example1.factory.impl;

import example1.factory.TVFactory;
import example1.product.TV;
import example1.product.impl.HisenseTV;

/**
 * 具体的产品工厂
 * 
 * @author wuzz
 * @date 2018年10月8日 上午11:49:16
 */
public class HisenseTVFactory implements TVFactory {
	@Override
	public TV produceTV() {
		System.out.println("海信电视机工厂生产海信电视机。");
		return new HisenseTV();
	}
}