package example2.command;

public abstract class AbstractCommand {
	public abstract int execute(int value);

	public abstract int undo();
}
