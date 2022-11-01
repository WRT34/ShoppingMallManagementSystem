package com.tnsif.client.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tnsif.client.entities.OrderDetails;

public interface IOrderRepository extends JpaRepository<OrderDetails, Integer> {

}
