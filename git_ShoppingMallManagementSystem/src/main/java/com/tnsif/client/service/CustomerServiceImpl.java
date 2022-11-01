package com.tnsif.client.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.tnsif.client.entities.Item;
import com.tnsif.client.entities.Mall;
import com.tnsif.client.entities.OrderDetails;
import com.tnsif.client.entities.User;
import com.tnsif.client.repository.IItemRepository;
import com.tnsif.client.repository.IMallRepository;
import com.tnsif.client.repository.IOrderRepository;
import com.tnsif.client.repository.IUserRepository;

public class CustomerServiceImpl implements ICustomerService {

	@Autowired
	IItemRepository itemRepository;
	
	@Autowired
	IMallRepository mallRepository;
	
	@Autowired
	IUserRepository userRepository;
	
	@Autowired
	IOrderRepository orderRepository;
	
	@Override
	public List<Item> searchItem(String itemName) {
		// TODO Auto-generated method stub
		return itemRepository.findByName(itemName);
	}

	@Override
	public void orderItem(OrderDetails order) {
		// TODO Auto-generated method stub
		orderRepository.save(order);
	}

	@Override
	public Mall searchMall(Integer id) {
		// TODO Auto-generated method stub
		return mallRepository.findById(id).get();
	}

	@Override
	public boolean cancelOrder(Integer id) {
		// TODO Auto-generated method stub
		orderRepository.deleteById(id);
		return !orderRepository.existsById(id);
	}

	@Override
	public User login(User user) {
		// TODO Auto-generated method stub
		return user;
	}

	@Override
	public boolean logout() {
		// TODO Auto-generated method stub
		return false;
	}

	

}
