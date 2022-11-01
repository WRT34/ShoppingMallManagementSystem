package com.tnsif.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tnsif.client.entities.User;
import com.tnsif.client.service.IUserService;

@RestController
@RequestMapping("user")
public class UserController {
	
	@Autowired
	IUserService userService;
	
	@PostMapping("/create")
	public void addNewUser(@RequestBody User user) {
		userService.addNewUser(user);
	}
	
	@PutMapping("/update/{id}")
	public void updateUser(@PathVariable Integer id,@RequestBody User user) {
		userService.updateUser(id, user);
	}
}
