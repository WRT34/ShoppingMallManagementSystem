package com.tnsif.client.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tnsif.client.entities.Item;
import com.tnsif.client.entities.Mall;
import com.tnsif.client.entities.User;
import com.tnsif.client.repository.IItemRepository;
import com.tnsif.client.repository.IMallRepository;
import com.tnsif.client.repository.IOrderRepository;
import com.tnsif.client.repository.IUserRepository;

@Service
@Transactional
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
		return itemRepository.findByNameContaining(itemName);
	}

	@Override
	public void orderItem(Item item) {
		// TODO Auto-generated method stub
		itemRepository.save(item);
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
