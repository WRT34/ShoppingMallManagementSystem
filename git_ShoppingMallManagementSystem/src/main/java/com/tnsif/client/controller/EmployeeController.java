package com.tnsif.client.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tnsif.client.entities.Employee;
import com.tnsif.client.service.IEmployeeService;

@RestController
@RequestMapping("employee")
public class EmployeeController {
		
	@Autowired
	private IEmployeeService service;
		
	// RESTful API methods for Retrieval operations
	@GetMapping("/list")
	public List<Employee> getAllEmployees(){
		return service.listAllEmployees();
	}
	
	@GetMapping("/search/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable Integer id){
		Employee employee = service.searchEmployee(id);
		return new ResponseEntity<Employee>(employee, HttpStatus.OK);
	}	
	
	//RESTful API method for Create operation
	@PostMapping("/create")
	public void createEmployee(@RequestBody Employee employee) {
		service.addEmployee(employee);
	}	
	
	// RESTful API method for Delete operation
	@DeleteMapping("/delete/{id}")
	public void deleteEmployeeById(@PathVariable Integer id) {
		service.deleteEmployee(id);
	}
	
	//RESTful API method for Update operation
	@PutMapping("/update/{id}")
	public void updateEmployee(@PathVariable Integer id,@RequestBody Employee employeeDetails){
		service.updateEmployee(id, employeeDetails);
	}
	
}
