package example1.command.Concrete;

import example1.command.AbstractCommand;
import example1.Receiver.Television;

public class TVOpenCommand implements AbstractCommand {
    private Television tv;

    public TVOpenCommand() {
        tv = new Television();
    }

    @Override
    public void execute() {
        tv.open();
    }
}