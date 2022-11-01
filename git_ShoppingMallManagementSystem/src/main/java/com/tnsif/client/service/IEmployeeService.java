package com.tnsif.client.service;


import com.tnsif.client.entities.Employee;

public interface IEmployeeService {

	void addEmployee(Employee employee);
	
	void updateEmployee(Integer id,Employee employeeDetails);
	
	Employee searchEmployee(Integer id);
	
	void deleteEmployee(Integer id);
	
}
