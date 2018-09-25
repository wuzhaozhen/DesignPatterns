package com.wuzz.dao;

public interface UserDao {
	int findPermission(String userName, String userPassword);
}
