package example1.command.impl;

import example1.command.AbstractCommand;
import example1.command.impl.receiver.Television;

public class TVCloseCommand implements AbstractCommand {
	private Television tv;

	public TVCloseCommand() {
		tv = new Television();
	}

	public void execute() {
		tv.close();
	}
}