package example1.State;

import example1.Context.ForumAccount;

/**
 * 抽象状态类
 * 
 * @Author wuzz
 * @Date 2018年10月8日 下午10:30:20
 */
public abstract class AbstractState {
	public ForumAccount acc;
	protected int point;
	public String stateName;

	/**
	 * 进行对象切换
	 *
	 * @author wuzz
	 * @date 2018年10月9日 下午2:21:17
	 * @param score
	 */
	public abstract void checkState(int score);

	public void downloadFile(int score) {
		System.out.println(acc.getName() + "下载文件，扣除" + score + "积分。");
		this.point -= score;
		checkState(score);
		System.out.println("剩余积分为：" + this.point + "，当前级别为：" + acc.getState().stateName + "。");
	}

	public void writeNote(int score) {
		System.out.println(acc.getName() + "发布留言" + "，增加" + score + "积分。");
		this.point += score;
		checkState(score);
		System.out.println("剩余积分为：" + this.point + "，当前级别为：" + acc.getState().stateName + "。");
	}

	public void replyNote(int score) {
		System.out.println(acc.getName() + "回复留言，增加" + score + "积分。");
		this.point += score;
		checkState(score);
		System.out.println("剩余积分为：" + this.point + "，当前级别为：" + acc.getState().stateName + "。");
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public int getPoint() {
		return (this.point);
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public String getStateName() {
		return (this.stateName);
	}
}