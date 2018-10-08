package example1;

import example1.template.BankTemplateMethod;
import example1.template.impl.Transfer;

public class Client {
	public static void main(String a[]) {
		BankTemplateMethod bank=new Transfer();
		bank.process();
		System.out.println("---------------------------------------");
	}
}
