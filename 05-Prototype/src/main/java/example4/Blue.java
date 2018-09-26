package example4;

public class Blue implements MyColor {
	public Object clone() {
		Blue b = null;
		try {
			b = (Blue) super.clone();
		} catch (CloneNotSupportedException e) {

		}
		return b;
	}

	public void display() {
		System.out.println("This is Blue!");
	}
}
