package com.tnsif.client.entities;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class OrderDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id ;
	private LocalDate dateOfPurchase ;
	private Float total;
	private String paymentMode;
	
//	private Shop shop_id;
//	
//	private Customer customer_id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDate getDateOfPurchase() {
		return dateOfPurchase;
	}

	public void setDateOfPurchase(LocalDate dateOfPurchase) {
		this.dateOfPurchase = dateOfPurchase;
	}

	public Float getTotal() {
		return total;
	}

	public void setTotal(Float total) {
		this.total = total;
	}

	public String getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

//	public Shop getShop_id() {
//		return shop_id;
//	}
//
//	public void setShop_id(Shop shop_id) {
//		this.shop_id = shop_id;
//	}
//
//	public Customer getCustomer_id() {
//		return customer_id;
//	}
//
//	public void setCustomer_id(Customer customer_id) {
//		this.customer_id = customer_id;
//	}
	
	
	
}
