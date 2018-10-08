package example1.abstraction;

import example1.Implementor.Color;

/**
 * 抽象类
 * 
 * @author wuzz
 * @date 2018年10月8日 下午2:23:46
 */
public abstract class Pen {
	protected Color color;

	public void setColor(Color color) {
		this.color = color;
	}

	public abstract void draw(String name);
}