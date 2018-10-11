package example1.command.Concrete;

import example1.command.AbstractCommand;
import example1.Receiver.Television;

public class TVCloseCommand implements AbstractCommand {
    private Television tv;

    public TVCloseCommand() {
        tv = new Television();
    }

    @Override
    public void execute() {
        tv.close();
    }
}