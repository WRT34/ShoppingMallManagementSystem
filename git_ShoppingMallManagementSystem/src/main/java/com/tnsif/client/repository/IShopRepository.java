package com.tnsif.client.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tnsif.client.entities.Shop;

public interface IShopRepository extends JpaRepository<Shop, Integer>{

}
