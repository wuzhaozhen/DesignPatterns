package example1.aggregate.concrete;

import example1.aggregate.Television;
import example1.iterator.TVIterator;
import example1.iterator.concrete.SkyworthIterator;

/**
 * 具体聚合类
 * 
 * @author wuzz
 * @date 2018年10月9日 下午4:17:11
 */
public class SkyworthTelevision implements Television {

	@Override
	public TVIterator createIterator() {
		Object[] obj = { "CCTV-1", "CCTV-2", "CCTV-3", "CCTV-4", "CCTV-5", "CCTV-6", "CCTV-7", "CCTV-8" };
		return new SkyworthIterator(obj);
	}

}