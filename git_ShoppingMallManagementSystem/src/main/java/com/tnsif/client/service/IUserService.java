package com.tnsif.client.service;

import com.tnsif.client.entities.User;

public interface IUserService {
	
	void addNewUser(User user);		
	
	void updateUser(Integer id, User user);
	
	User login();
	
	boolean logout();
	
}
