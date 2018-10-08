package example1.product;

/**
 * 需要的产品
 * 
 * @author wuzz
 * @date 2018年10月8日 下午1:27:34
 */
public class Meal {
	// food和drink是部件
	private String food;
	private String drink;

	public void setFood(String food) {
		this.food = food;
	}

	public void setDrink(String drink) {
		this.drink = drink;
	}

	public String getFood() {
		return (this.food);
	}

	public String getDrink() {
		return (this.drink);
	}
}