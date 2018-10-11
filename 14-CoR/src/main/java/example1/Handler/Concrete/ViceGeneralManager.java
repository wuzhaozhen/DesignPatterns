package example1.Handler.Concrete;

import example1.Handler.Leader;

public class ViceGeneralManager extends Leader {
	public ViceGeneralManager(String name) {
		super(name);
	}

	@Override
	public void handleRequest(String userName, int days) {
		if (days < 20) {
			System.out.println("副总经理" + name + "审批员工" + userName + "的请假条，请假天数为" + days + "天。");
		} else {
			if (this.successor != null) {
				this.successor.handleRequest(userName, days);
			}
		}
	}

}