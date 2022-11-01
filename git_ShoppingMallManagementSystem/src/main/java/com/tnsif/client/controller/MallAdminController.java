package com.tnsif.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tnsif.client.entities.Mall;
import com.tnsif.client.service.IAdminService;
import com.tnsif.client.service.IMallService;
import com.tnsif.entities.*;
import com.tnsif.service.*;

@RestController
@RequestMapping("mall")
public class MallAdminController {
	
	@Autowired
	private IAdminService service;
	
	@GetMapping("/searchMall/{id}")
	public ResponseEntity<Mall> getMallById(@PathVariable Integer id){
		 Mall mall = service.searchMall(id);
		return new ResponseEntity<Mall>(mall, HttpStatus.OK);
	}	
	
	@GetMapping("/searchMallAdmin/{id}")
	public ResponseEntity<MallAdmin> getMallAdminById(@PathVariable Integer id){
		 MallAdmin admin = service.searchMallAdmin(id);
		return new ResponseEntity<MallAdmin>(admin, HttpStatus.OK);
	}	
	
	@GetMapping("/searchUser/{id}")
	public ResponseEntity<User> getUserById(@PathVariable Integer id){
		 User user = service.searchUser(id);
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}	
	
	@GetMapping("/approveShop/{id}")
	public void approveNewShop(@RequestBody Shop shop){
		 service.approveNewShop(shop);
		
	}	
	
	@PutMapping("/update/{id}")
	public void updateUser(@PathVariable Integer id,@RequestBody User user){
		service.updateUser(id, user);
	}
	
	@PutMapping("/update/{id}")
	public void updateMall(@PathVariable Integer id,@RequestBody Mall mall){
		service.updateMall(id, mall);
	}
	
	@PutMapping("/update/{id}")
	public void updateMallAdmin(@PathVariable Integer id,@RequestBody MallAdmin admin){
		service.updateMallAdmin(id, admin);
	}
	
	
	@DeleteMapping("MallAdmin/{id}")
	public void delete(@PathVariable Integer id) {
		service.deleteMallAdmin(id);
	}
}
