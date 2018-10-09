package example1.aggregate;

import example1.iterator.TVIterator;

/**
 * 抽象聚合类
 * 
 * @author wuzz
 * @date 2018年10月9日 下午4:16:56
 */
public interface Television {
	TVIterator createIterator();
}