package com.tnsif.client.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tnsif.client.entities.User;

public interface IUserRepository extends JpaRepository<User, Integer> {

}
