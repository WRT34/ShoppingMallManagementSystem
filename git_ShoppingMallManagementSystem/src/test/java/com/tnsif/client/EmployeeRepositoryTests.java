package com.tnsif.client;

import java.time.LocalDate;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ContextConfiguration;

import com.tnsif.client.entities.Employee;
import com.tnsif.client.repository.EmployeeRepository;


@DataJpaTest
public class EmployeeRepositoryTests {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Test
	public void saveEmployeeTest() {
		Employee employee = new Employee("Raj",LocalDate.parse("2007-12-03"), 10000.0f, "Ämerica", "Manager");
		employeeRepository.save(employee);
		
		Assertions.assertThat(employee.getId()).isGreaterThan(0);
		
	}
	
}
