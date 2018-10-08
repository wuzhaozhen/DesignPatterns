package example1.product.impl;

import example1.product.Television;

/**
 * 具体的产品
 * 
 * @author wuzz
 * @date 2018年10月8日 上午11:59:41
 */
public class TCLTelevision implements Television {

	@Override
	public void play() {
		System.out.println("TCL电视机播放中......");
	}

}