package com.tnsif.client.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tnsif.client.entities.Item;
import com.tnsif.client.entities.Mall;
import com.tnsif.client.entities.OrderDetails;
import com.tnsif.client.repository.IItemRepository;
import com.tnsif.client.service.ICustomerService;

@RestController
@RequestMapping("customer")
public class CustomerController {

	@Autowired
	private ICustomerService customerService;
	
	
	@GetMapping("/searchItem/{name}")
	public ResponseEntity<List<Item>> listItemsByName(@PathVariable String name){
		List<Item> items = customerService.searchItem(name);
		return new ResponseEntity<List<Item>>(items, HttpStatus.OK);
	}
	
//	@PostMapping("/orderItem")
//	public void orderItem(@RequestBody OrderDetails order) {
//		customerService.orderItem(order);
//	}
	
	@PostMapping("/orderItems")
	public void orderItems(@RequestBody Item item) {
		customerService.orderItem(item);
	}
	
	@DeleteMapping("/cancelOrder/{id}")
	public void cancelOrder(@PathVariable Integer id) {
		customerService.cancelOrder(id);
	}
	
	@GetMapping("/searchMall/{id}")
	public ResponseEntity<Mall> searchMall(@PathVariable Integer id){
		Mall mall = customerService.searchMall(id);
		return new ResponseEntity<Mall>(mall,HttpStatus.OK);
	}
}
