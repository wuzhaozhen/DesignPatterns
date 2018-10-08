package example1.builder.impl;

import example1.builder.MealBuilder;

/**
 * 具体的建造者
 * 
 * @author wuzz
 * @date 2018年10月8日 下午1:23:59
 */
public class SubMealBuilderA extends MealBuilder {

	@Override
	public void buildFood() {
		meal.setFood("一个鸡腿堡");
	}

	@Override
	public void buildDrink() {
		meal.setDrink("一杯可乐");
	}
}