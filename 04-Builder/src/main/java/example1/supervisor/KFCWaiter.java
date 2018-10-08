package example1.supervisor;

import example1.builder.MealBuilder;
import example1.product.Meal;

/**
 * 监工角色
 * 
 * @author wuzz
 * @date 2018年10月8日 下午1:23:17
 */
public class KFCWaiter {
	private MealBuilder mb;

	public void setMealBuilder(MealBuilder mb) {
		this.mb = mb;
	}

	public Meal construct() {
		mb.buildFood();
		mb.buildDrink();
		return mb.getMeal();
	}
}