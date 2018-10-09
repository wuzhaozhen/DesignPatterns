package example2.Context;

import example2.State.State;
import example2.State.ConcreteState.OffState;
import example2.State.ConcreteState.OnState;

public class Switch {
	private static State state, onState, offState;
	private String name;

	public Switch(String name) {
		this.name = name;
		onState = new OnState();
		offState = new OffState();
		state = onState;
	}

	public void setState(State state) {
		Switch.state = state;
	}

	public void on() {
		System.out.print(name);
		state.on(this);
	}

	public void off() {
		System.out.print(name);
		state.off(this);
	}

	public static State getState(String type) {
		if (type.equalsIgnoreCase("on")) {
			return onState;
		} else {
			return offState;
		}
	}
}
