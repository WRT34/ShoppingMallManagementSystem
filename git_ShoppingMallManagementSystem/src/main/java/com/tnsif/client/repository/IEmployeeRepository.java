package com.tnsif.client.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tnsif.client.entities.Employee;

public interface IEmployeeRepository extends JpaRepository<Employee, Integer>{
	
}
