package example1.aggregate.concrete;

import example1.aggregate.Television;
import example1.iterator.TVIterator;
import example1.iterator.concrete.TCLIterator;

/**
 * 具体聚合类
 * 
 * @author wuzz
 * @date 2018年10月9日 下午4:17:11
 */
public class TCLTelevision implements Television {

	@Override
	public TVIterator createIterator() {
		Object[] obj = { "湖南卫视", "北京卫视", "上海卫视", "湖北卫视", "黑龙江卫视" };
		return new TCLIterator(obj);
	}
}