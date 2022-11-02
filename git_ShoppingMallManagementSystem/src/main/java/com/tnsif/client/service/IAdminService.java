package com.tnsif.client.service;

import com.tnsif.client.entities.Mall;
import com.tnsif.client.entities.Shop;
import com.tnsif.client.entities.User;

public interface IAdminService {
	
	void approveNewShop(Shop shop);
	
	void updateUser(Integer id,User user);
	
	User login();
	
	boolean logout();

	void updateMall(Integer id, Mall mall);

	User searchUser(Integer id);

	void addUser(User user);
}
