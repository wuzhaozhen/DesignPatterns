package example1.cor.children;

import example1.cor.Leader;

public class Director extends Leader {
	
	public Director(String name) {
		super(name);
	}

	@Override
	public void handleRequest(String userName, int days) {
		if (days < 3) {
			System.out.println("主任" + name + "审批员工" + userName + "的请假条，请假天数为" + days + "天。");
		} else {
			if (this.successor != null) {
				this.successor.handleRequest(userName, days);
			}
		}
	}

}