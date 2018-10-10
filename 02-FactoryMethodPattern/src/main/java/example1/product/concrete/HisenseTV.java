package example1.product.concrete;

import example1.product.TV;

/**
 * 具体的产品
 * 
 * @author wuzz
 * @date 2018年10月8日 上午11:48:19
 */
public class HisenseTV implements TV {
	@Override
	public void play() {
		System.out.println("海信电视机播放中......");
	}
}