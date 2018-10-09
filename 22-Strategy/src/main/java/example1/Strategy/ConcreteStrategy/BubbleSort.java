package example1.Strategy.ConcreteStrategy;

import example1.Strategy.Sort;
/**
 * （具体策略类）：它实现了在抽象策略类中声明的算法，在运行时，具体策略类将覆盖在环境类中定义的抽象策略类对象，使用一种具体的算法实现某个业务处理。
 * 
 * @author wuzz  
 * @date 2018年10月9日 下午1:17:56
 */
public class BubbleSort implements Sort {

	@Override
	public int[] sort(int arr[]) {
		int len = arr.length;
		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				int temp;
				if (arr[i] > arr[j]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		System.out.println("冒泡排序");
		return arr;
	}
}