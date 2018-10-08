package example2.command.impl.receiver;

public class Adder {
	private int num = 0;

	public int add(int value) {
		num += value;
		return num;
	}
}