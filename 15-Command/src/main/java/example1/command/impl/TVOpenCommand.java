package example1.command.impl;

import example1.command.AbstractCommand;
import example1.command.impl.receiver.Television;

public class TVOpenCommand implements AbstractCommand {
	private Television tv;

	public TVOpenCommand() {
		tv = new Television();
	}

	public void execute() {
		tv.open();
	}
}