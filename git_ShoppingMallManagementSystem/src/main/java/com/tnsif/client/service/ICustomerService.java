package com.tnsif.client.service;

import java.util.List;

import com.tnsif.client.entities.Item;
import com.tnsif.client.entities.Mall;
import com.tnsif.client.entities.OrderDetails;
import com.tnsif.client.entities.User;

public interface ICustomerService {

	List<Item> searchItem(String itemName);
	
	void orderItem(OrderDetails order);
	
	Mall searchMall(Integer id);
	
	boolean cancelOrder(Integer id);
	
	User login(User user);
	
	boolean logout();
}
