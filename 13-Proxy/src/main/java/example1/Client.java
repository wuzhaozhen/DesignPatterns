package example1;

import example1.proxy.AbstractPermission;
import example1.proxy.proxy.PermissionProxy;

public class Client {
	public static void main(String args[]) {
		AbstractPermission permission = new PermissionProxy();

		permission.modifyUserInfo();
		permission.viewNote();
		permission.publishNote();
		permission.modifyNote();
		System.out.println("----------------------------");
		
		permission.setLevel(1);
		permission.modifyUserInfo();
		permission.viewNote();
		permission.publishNote();
		permission.modifyNote();
	}
}