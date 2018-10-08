package example1.builder;

import example1.product.Meal;

/**
 * 建造者角色
 * 
 * @author wuzz
 * @date 2018年10月8日 下午1:22:47
 */
public abstract class MealBuilder {
	protected Meal meal = new Meal();

	public abstract void buildFood();

	public abstract void buildDrink();

	public Meal getMeal() {
		return meal;
	}
}