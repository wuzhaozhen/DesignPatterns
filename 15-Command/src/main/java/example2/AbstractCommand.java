package example2;

public abstract class AbstractCommand {
	public abstract int execute(int value);

	public abstract int undo();
}
