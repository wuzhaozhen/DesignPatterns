package example2.State.ConcreteState;

import example2.Context.Switch;
import example2.State.State;

public class OnState extends State {
	@Override
	public void on(Switch s) {
		System.out.println("已经打开！");
	}

	@Override
	public void off(Switch s) {
		System.out.println("关闭！");
		// 灯的状态由打开切换为关闭
		s.setState(Switch.getState("off"));
	}
}