package example1.Handler.Concrete;

import example1.Handler.Leader;

/**
 * 具体处理者
 */
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