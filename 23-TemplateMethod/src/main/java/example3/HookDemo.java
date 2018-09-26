package example3;

public abstract class HookDemo {
	public abstract void getData();

	public void convertData() {
		System.out.println("通用的数据转换操作。");
	}

	public abstract void displayData();

	public void process() {
		getData();
		if (isValid()) {
			convertData();
		}
		displayData();
	}

	public boolean isValid() {
		return true;
	}
}
