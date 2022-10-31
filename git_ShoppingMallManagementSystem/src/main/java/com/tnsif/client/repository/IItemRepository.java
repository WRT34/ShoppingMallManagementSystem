package com.tnsif.client.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tnsif.client.entities.Item;

public interface IItemRepository extends JpaRepository<Item, Integer>{

}
