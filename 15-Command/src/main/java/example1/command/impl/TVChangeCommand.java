package example1.command.impl;

import example1.command.AbstractCommand;
import example1.command.impl.receiver.Television;

public class TVChangeCommand implements AbstractCommand {
	private Television tv;

	public TVChangeCommand() {
		tv = new Television();
	}

	public void execute() {
		tv.changeChannel();
	}
}