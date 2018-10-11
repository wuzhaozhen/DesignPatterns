package example1.Handler.Concrete;

import example1.Handler.Leader;

public class Manager extends Leader {
	public Manager(String name) {
		super(name);
	}
	
	@Override
	public void handleRequest(String userName, int days) {
		if (days < 10) {
			System.out.println("经理" + name + "审批员工" + userName + "的请假条，请假天数为" + days + "天。");
		} else {
			if (this.successor != null) {
				this.successor.handleRequest(userName, days);
			}
		}
	}
}