package com.tnsif.client.service;

import com.tnsif.client.entities.Employee;
import com.tnsif.client.entities.Item;
import com.tnsif.client.entities.Shop;

public interface IShopService {

	void addShop(Shop shop);
	
	void updateShop(Integer id,Shop shop);
	
	Shop searchShop(Integer id);
	
	void deleteShop(Integer id);
	
	void addEmployee(Employee employee);
	
	void updateEmployee(Integer id, Employee employee);
	
	void addItem(Item item);
}
