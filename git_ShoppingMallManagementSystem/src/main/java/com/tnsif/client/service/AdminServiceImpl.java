package com.tnsif.client.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tnsif.client.entities.Shop;
import com.tnsif.client.entities.User;
import com.tnsif.client.repository.IShopRepository;
import com.tnsif.client.repository.IUserRepository;

@Service
@Transactional
public class AdminServiceImpl implements IAdminService{

//	@Autowired
//	IMallAdminRepository adminRepository;
	
	@Autowired
	IShopRepository shopRepository;
	
	@Autowired
	IUserRepository userRepository;
	
	@Override
	public void approveNewShop(Shop shop) {
		// TODO Auto-generated method stub
		shopRepository.save(shop);
	}

	@Override
	public void updateUser(Integer id, User user) {
		// TODO Auto-generated method stub
		User updateUser = userRepository.findById(id).get();
		updateUser.setName(user.getName());
		updateUser.setPassword(user.getPassword());
		updateUser.setType(user.getType());
		userRepository.save(updateUser);
	}

	@Override
	public User login() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean logout() {
		// TODO Auto-generated method stub
		return false;
	}

}
