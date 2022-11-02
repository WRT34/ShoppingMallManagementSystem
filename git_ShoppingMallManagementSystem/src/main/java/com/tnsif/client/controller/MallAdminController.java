package com.tnsif.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tnsif.client.entities.Mall;
import com.tnsif.client.entities.Shop;
import com.tnsif.client.entities.User;
import com.tnsif.client.service.IAdminService;


@RestController
@RequestMapping("mall")
public class MallAdminController {
	
	@Autowired
	private IAdminService service;
		
	@GetMapping("/approveShop/{id}")
	public void approveNewShop(@RequestBody Shop shop){
		 service.approveNewShop(shop);
	}	
	
	@PutMapping("/updateUser/{id}")
	public void updateUser(@PathVariable Integer id,@RequestBody User user){
		service.updateUser(id, user);
	}
	
	@PutMapping("/update/{id}")
	public void updateMall(@PathVariable Integer id,@RequestBody Mall mall){
		service.updateMall(id, mall);
	}
	
	@GetMapping("/searchUser/{id}")
	public User searchUser(@PathVariable Integer id) {
		// TODO Auto-generated method stub
		return service.searchUser(id);
	}

	@PostMapping("/addUser")
	public void addUser(@RequestBody User user) {
		// TODO Auto-generated method stub
		service.addUser(user);
	}
	
}
