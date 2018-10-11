package example2;

import example2.Invoker.CalculatorForm;
import example2.command.Concrete.ConcreteCommand;

public class Client {
	public static void main(String args[]) {
		CalculatorForm form = new CalculatorForm();
		ConcreteCommand command = new ConcreteCommand();
		form.setCommand(command);

		form.compute(10);
		form.compute(5);
		form.compute(10);
		form.undo();
	}
}