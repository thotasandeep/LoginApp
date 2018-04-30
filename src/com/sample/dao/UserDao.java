package com.sample.dao;

import com.sample.bean.User;

public interface UserDao {

	User getUser();
	boolean validateUser(User user);
}
