package example1.cor.children;

import example1.cor.Leader;

public class GeneralManager extends Leader {
	public GeneralManager(String name) {
		super(name);
	}

	@Override
	public void handleRequest(String userName, int days) {
		if (days < 30) {
			System.out.println("总经理" + name + "审批员工" + userName + "的请假条，请假天数为" + days + "天。");
		} else {
			System.out.println("莫非" + userName + "想辞职，居然请假" + days + "天。");
		}
	}

}