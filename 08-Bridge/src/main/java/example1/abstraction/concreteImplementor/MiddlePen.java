package example1.abstraction.concreteImplementor;

import example1.abstraction.Pen;

/**
 * 抽象类扩展
 * 
 * @author wuzz
 * @date 2018年10月8日 下午2:24:33
 */
public class MiddlePen extends Pen {

	@Override
	public void draw(String name) {
		String penType = "中号毛笔绘制";
		this.color.bepaint(penType, name);
	}
}