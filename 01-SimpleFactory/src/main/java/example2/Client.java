package example2;

import example2.factory.User;
import example2.factory.impl.Administrator;

public class Client {
	public static void main(String args[]) {
		User user = new Administrator();
		user.sameOperation();
		user.diffOperation();
	}
}
