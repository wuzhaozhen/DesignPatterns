package example1.Implementor.RefinedAbstraction;

import example1.Implementor.Color;

/**
 * 具体的实现
 * 
 * @author wuzz
 * @date 2018年10月8日 下午2:26:30
 */
public class White implements Color {

	@Override
	public void bepaint(String penType, String name) {
		System.out.println(penType + "白色的" + name + ".");
	}
}