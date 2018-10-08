package example1;

import example1.command.AbstractCommand;
import example1.command.Controller;
import example1.command.impl.TVChangeCommand;
import example1.command.impl.TVCloseCommand;
import example1.command.impl.TVOpenCommand;

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