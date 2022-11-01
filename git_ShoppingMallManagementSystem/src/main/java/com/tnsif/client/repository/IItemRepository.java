package com.tnsif.client.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tnsif.client.entities.Item;

public interface IItemRepository extends JpaRepository<Item, Integer>{
	List<Item> findByName(String name);
}
