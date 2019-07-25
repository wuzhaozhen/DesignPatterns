package example1.factory;

import example1.product.TV;

/**
 * 产品工厂统一接口
 * 
 * @author wuzz
 * @date 2018年10月8日 上午11:48:53
 */
public interface TVFactory {
	TV produceTV();
}