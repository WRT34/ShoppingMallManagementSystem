package com.tnsif.client.repository;

import com.tnsif.client.entities.Mall;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMallRepository extends JpaRepository<Mall, Integer> //Entity class
{

}

