package example1;

import example1.command.AbstractCommand;
import example1.Invoker.Controller;
import example1.command.Concrete.TVChangeCommand;
import example1.command.Concrete.TVCloseCommand;
import example1.command.Concrete.TVOpenCommand;

public class Client {
	public static void main(String a[]) {
		AbstractCommand openCommand, closeCommand, changeCommand;

		openCommand = new TVOpenCommand();
		closeCommand = new TVCloseCommand();
		changeCommand = new TVChangeCommand();

		Controller control = new Controller(openCommand, closeCommand, changeCommand);

		control.open();
		control.change();
		control.close();
	}
}