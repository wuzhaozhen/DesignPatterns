package example2;

public class ConcreteCommand extends AbstractCommand {
	private Adder adder = new Adder();
	private int value;

	public int execute(int value) {
		this.value = value;
		return adder.add(value);
	}

	public int undo() {
		return adder.add(-value);
	}
}
