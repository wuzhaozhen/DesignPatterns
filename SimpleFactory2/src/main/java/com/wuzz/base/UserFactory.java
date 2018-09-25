package com.wuzz.base;

import com.wuzz.service.User;
import com.wuzz.service.impl.Administrator;
import com.wuzz.service.impl.Employee;
import com.wuzz.service.impl.Manager;

public class UserFactory {
	public static User getUser(int permission) {
		if (0 == permission) {
			return new Employee();
		} else if (1 == permission) {
			return new Manager();
		} else if (2 == permission) {
			return new Administrator();
		} else {
			return null;
		}
	}
}