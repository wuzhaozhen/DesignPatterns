package example2.State.ConcreteState;

import example2.Context.Switch;
import example2.State.State;

public class OffState extends State {
	
	@Override
	public void on(Switch s) {
		System.out.println("打开！");
		// 灯的状态由关闭切换为打开
		s.setState(Switch.getState("on"));
	}

	@Override
	public void off(Switch s) {
		System.out.println("已经关闭！");
	}
}
