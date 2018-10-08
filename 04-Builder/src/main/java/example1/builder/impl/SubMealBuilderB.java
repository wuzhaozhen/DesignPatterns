package example1.builder.impl;

import example1.builder.MealBuilder;

/**
 * 具体的建造者
 * 
 * @author wuzz
 * @date 2018年10月8日 下午1:23:59
 */
public class SubMealBuilderB extends MealBuilder {

	@Override
	public void buildFood() {
		meal.setFood("一个鸡肉卷");
	}

	@Override
	public void buildDrink() {
		meal.setDrink("一杯果汁");
	}
}