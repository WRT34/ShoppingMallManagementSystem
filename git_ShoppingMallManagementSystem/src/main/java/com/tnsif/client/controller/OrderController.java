package com.tnsif.client.controller;

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

import com.tnsif.client.entities.Item;
import com.tnsif.client.entities.OrderDetails;
import com.tnsif.client.service.IOrderService;

@RestController
@RequestMapping("order")
public class OrderController {
	
	@Autowired
	IOrderService orderService;
	
	@PostMapping("/createOrder")
	public void addOrder(@RequestBody OrderDetails order) {
		orderService.addOrder(order);
	}
	
	@GetMapping("/search/{id}")
	public ResponseEntity<OrderDetails> searchOrder(@PathVariable Integer id) {
		OrderDetails orderDetails = orderService.searchOrder(id);
		return new ResponseEntity<OrderDetails>(orderDetails, HttpStatus.OK);
	}
	
	@PostMapping("/addItem")
	public void addItem(@RequestBody Item item) {
		orderService.addItem(item);
	}
	
	@DeleteMapping("/deleteOrder/{id}")
	public void cancelOrder(Integer id) {
		orderService.cancelOrder(id);
	}
	
	@PutMapping("/updateOrder/{id}")
	public void updateOrder(@PathVariable Integer id,@RequestBody OrderDetails order) {
		orderService.updateOrder(id, order);
	}
}
