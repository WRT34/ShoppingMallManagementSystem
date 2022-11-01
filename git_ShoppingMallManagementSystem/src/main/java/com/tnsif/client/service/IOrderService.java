package com.tnsif.client.service;

import com.tnsif.client.entities.Item;
import com.tnsif.client.entities.OrderDetails;

public interface IOrderService {
	
	void addOrder(OrderDetails order);
	
	void updateOrder(Integer id,OrderDetails order);
	
	OrderDetails searchOrder(Integer id);
	
	void cancelOrder(Integer id);
	
	void addItem(Item item);
}
