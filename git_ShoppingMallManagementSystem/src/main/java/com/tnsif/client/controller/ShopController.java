package com.tnsif.client.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tnsif.client.entities.Shop;
import com.tnsif.client.service.ShopService;

@RestController
@RequestMapping("shop")
public class ShopController {

	@Autowired
	private ShopService service;
	
	@GetMapping("/list")
	public List<Shop> getAllShops(){
		return service.listAllShops();
	}
	
	@PostMapping("/create")
	public void createShop(@RequestBody Shop shop) {
		service.addShop(shop);
	}
	
	@GetMapping("/search/{id}")
	public ResponseEntity<Shop> getShopById(@PathVariable Integer id){
		Shop shop = service.searchShop(id);
		return new ResponseEntity<Shop>(shop, HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteShopById(@PathVariable Integer id) {
		service.deleteShop(id);
	}
	
	@PutMapping("/update/{id}")
	public void updateShop(@PathVariable Integer id,@RequestBody Shop shop) {
		service.updateShop(id, shop);
	}
}
