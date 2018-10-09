package example1.Context;

import example1.State.AbstractState;
import example1.State.ConcreteState.PrimaryState;

/**
 * 环境类（拥有状态的对象）
 * 
 * @Author wuzz
 * @Date 2018年10月8日 下午10:29:15
 */
public class ForumAccount {
	private AbstractState state;
	private String name;

	public ForumAccount(String name) {
		this.name = name;
		this.state = new PrimaryState(this);
		System.out.println(this.name + "注册成功！");
		System.out.println("---------------------------------------------");
	}

	public void setState(AbstractState state) {
		this.state = state;
	}

	public AbstractState getState() {
		return this.state;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void downloadFile(int score) {
		state.downloadFile(score);
	}

	public void writeNote(int score) {
		state.writeNote(score);
	}

	public void replyNote(int score) {
		state.replyNote(score);
	}
}