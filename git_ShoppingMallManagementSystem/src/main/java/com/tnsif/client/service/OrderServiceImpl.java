package com.tnsif.client.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tnsif.client.entities.Item;
import com.tnsif.client.entities.OrderDetails;
import com.tnsif.client.repository.IItemRepository;
import com.tnsif.client.repository.IOrderRepository;

@Service
@Transactional
public class OrderServiceImpl implements IOrderService {

	@Autowired
	private IOrderRepository orderRepository;
	
	@Autowired
	private IItemRepository itemRepository;
	
	@Override
	public void addOrder(OrderDetails order) {
		// TODO Auto-generated method stub
		orderRepository.save(order);
	}

	@Override
	public void updateOrder(Integer id, OrderDetails order) {
		// TODO Auto-generated method stub
		 OrderDetails updateOrder = this.searchOrder(id);
		 updateOrder.setPaymentMode(order.getPaymentMode());
		 updateOrder.setDateOfPurchase(order.getDateOfPurchase());
		 updateOrder.setTotal(order.getTotal());
		 this.addOrder(updateOrder);	
	}

	@Override
	public OrderDetails searchOrder(Integer id) {
		// TODO Auto-generated method stub
		return orderRepository.findById(id).get();
	}

	@Override
	public void cancelOrder(Integer id) {
		// TODO Auto-generated method stub
		orderRepository.deleteById(id);
	}

	@Override
	public void addItem(Item item) {
		// TODO Auto-generated method stub
		itemRepository.save(item);
	}

}
