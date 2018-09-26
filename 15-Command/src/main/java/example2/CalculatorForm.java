package example2;

public class CalculatorForm {
	private AbstractCommand command;

	public void setCommand(AbstractCommand command) {
		this.command = command;
	}

	public void compute(int value) {
		int i = command.execute(value);
		System.out.println("ִ�����㣬������Ϊ��" + i);
	}

	public void undo() {
		int i = command.undo();
		System.out.println("ִ�г�����������Ϊ��" + i);
	}
}
