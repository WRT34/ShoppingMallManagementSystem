package com.tnsif.client.controller;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	public ResponseEntity<?> updateUser(@PathVariable Integer id,@RequestBody User user){
		try {
			service.updateUser(id, user);
			return new ResponseEntity<>("User updated", HttpStatus.OK);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			return new ResponseEntity<>("User not found", HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("/createMall")
	public void createMall(Mall mall) {
		service.createMall(mall);
	}
	
	@PutMapping("/updateMall/{id}")
	public ResponseEntity<?> updateMall(@PathVariable Integer id,@RequestBody Mall mall){
		try {
			service.updateMall(id, mall);
			return new ResponseEntity<>("Mall updated", HttpStatus.OK);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			return new ResponseEntity<>("Mall not found", HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping("/searchUser/{id}")
	public ResponseEntity<?> searchUser(@PathVariable Integer id) {
		// TODO Auto-generated method stub
		try {
		    User user = service.searchUser(id);
		    return new ResponseEntity<User>(user, HttpStatus.OK);
		}
		catch(NoSuchElementException e) {
			return new ResponseEntity<>("User not found", HttpStatus.NOT_FOUND);
		}
	}

	@PostMapping("/addUser")
	public void addUser(@RequestBody User user) {
		// TODO Auto-generated method stub
		service.addUser(user);
	}
	
}
