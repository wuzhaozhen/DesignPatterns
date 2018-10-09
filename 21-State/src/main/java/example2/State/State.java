package example2.State;

import example2.Context.Switch;

public abstract class State {
	public abstract void on(Switch s);

	public abstract void off(Switch s);
}
