package example1.decorator.decorator;

import example1.decorator.Transform;

/**
 * 装饰类
 * 
 * @author wuzz
 * @date 2018年10月8日 下午2:51:45
 */
public class Changer implements Transform {
	private Transform transform;

	public Changer(Transform transform) {
		this.transform = transform;
	}

	@Override
	public void move() {
		transform.move();
	}
}