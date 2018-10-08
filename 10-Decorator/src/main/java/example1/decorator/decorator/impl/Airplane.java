package example1.decorator.decorator.impl;

import example1.decorator.Transform;
import example1.decorator.decorator.Changer;

/**
 * 装饰类的具体实现
 * 
 * @author wuzz
 * @date 2018年10月8日 下午2:53:08
 */
public class Airplane extends Changer {

	public Airplane(Transform transform) {
		super(transform);
		System.out.println("变成飞机！");
	}

	public void fly() {
		System.out.println("在天空飞翔！");
	}
}