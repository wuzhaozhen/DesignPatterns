package example1.Context;

import example1.Strategy.Sort;

/**
 * 环境类。 注：是使用算法的角色，它在解决某个问题（即实现某个方法）时可以采用多种策略。
 * 在环境类中维持一个对抽象策略类的引用实例，用于定义所采用的策略。
 * 
 * @author wuzz
 * @date 2018年10月9日 下午1:15:17
 */
public class ArrayHandler {
	private Sort sortObj;

	public int[] sort(int arr[]) {
		sortObj.sort(arr);
		return arr;
	}

	public void setSortObj(Sort sortObj) {
		this.sortObj = sortObj;
	}
}