package com.sample.dao;

import java.util.ArrayList;
import java.util.List;

import com.sample.bean.User;

public class UserDaoImpl implements UserDao{

	static List<User> users = new ArrayList<User>();
	static {
		users.add(new User("admin","admin"));
		users.add(new User("manager","manager"));
		users.add(new User("hr","hr"));
	}
	
	@Override
	public User getUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean validateUser(User user) {
		
		for(User u: users) {
			if(user.getUsername().equals(u.getUsername()) 
			   && user.getPassword().equals(u.getPassword())) {
			
				return true;
			}
		}
		return false;
		
		
	}

}
