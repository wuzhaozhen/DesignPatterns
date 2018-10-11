package example1.Invoker;

import example1.command.AbstractCommand;

/**
 * 命令的请求者
 * 
 * @author wuzz
 * @date 2018年10月8日 下午4:27:41
 */
public class Controller {
	private AbstractCommand openCommand, closeCommand, changeCommand;

	public Controller(AbstractCommand openCommand, AbstractCommand closeCommand, AbstractCommand changeCommand) {
		this.openCommand = openCommand;
		this.closeCommand = closeCommand;
		this.changeCommand = changeCommand;
	}

	public void open() {
		openCommand.execute();
	}

	public void change() {
		changeCommand.execute();
	}

	public void close() {
		closeCommand.execute();
	}
}