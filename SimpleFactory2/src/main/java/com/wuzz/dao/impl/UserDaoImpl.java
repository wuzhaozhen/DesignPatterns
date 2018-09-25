package com.wuzz.dao.impl;

import com.wuzz.dao.UserDao;

public class UserDaoImpl implements UserDao {
	@Override
	public int findPermission(String userName, String userPassword) {
		if ("zhangsan" == userName && "123456" == userPassword) {
			return 2;
		} else {
			return -1;
		}
	}
}