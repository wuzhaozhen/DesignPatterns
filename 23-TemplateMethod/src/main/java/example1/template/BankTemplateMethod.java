package example1.template;

/**
 * 模板方法
 * 
 * @author wuzz
 * @date 2018年10月8日 上午11:16:33
 */
public abstract class BankTemplateMethod {
	private void takeNumber() {
		System.out.println("取号排队。");
	}

	protected abstract void transact();

	private void evaluate() {
		System.out.println("反馈评分。");
	}

	public void process() {
		this.takeNumber();
		this.transact();
		this.evaluate();
	}
}