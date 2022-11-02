package com.tnsif.client.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tnsif.client.entities.Employee;
import com.tnsif.client.entities.Item;
import com.tnsif.client.entities.Shop;
import com.tnsif.client.repository.IEmployeeRepository;
import com.tnsif.client.repository.IItemRepository;
import com.tnsif.client.repository.IShopRepository;

@Service
@Transactional
public class ShopServiceImpl implements IShopService{

	@Autowired
	private IShopRepository shopRepository;
	
	@Autowired
	private IItemRepository  iItemRepository;
	
	@Autowired
	private IEmployeeRepository employeeRepository;
	
	@Autowired
	private IEmployeeService employeeService;
	
	@Override
	public void addShop(Shop shop) {
		// TODO Auto-generated method stub
		shopRepository.save(shop);
	}

	@Override
	public void updateShop(Integer id, Shop shop) {
		// TODO Auto-generated method stub
		Shop updateShop = this.searchShop(id);
		 updateShop.setItems(shop.getItems());
		 updateShop.setLeaseStatus(shop.getLeaseStatus());
		 updateShop.setShopCategory(shop.getShopCategory());
		 updateShop.setShopName(shop.getShopName());
		 updateShop.setShopOwner(shop.getShopOwner());
		 updateShop.setShopStatus(shop.getShopStatus());
		 //updateShop.setCustomers(shop.getCustomers());
		 updateShop.setEmployees(shop.getEmployees());
		 this.addShop(updateShop);
	}

	@Override
	public Shop searchShop(Integer id) {
		// TODO Auto-generated method stub
		return shopRepository.findById(id).get();
	}

	@Override
	public void deleteShop(Integer id) {
		// TODO Auto-generated method stub
		shopRepository.deleteById(id);
	}

	@Override
	public void addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		employeeRepository.save(employee);
	}

	@Override
	public void updateEmployee(Integer id, Employee employeeDetails) {
		// TODO Auto-generated method stub
		 Employee updateEmployee = employeeService.searchEmployee(id);
		 updateEmployee.setName(employeeDetails.getName());
		 updateEmployee.setDesignation(employeeDetails.getDesignation());
		 updateEmployee.setAddress(employeeDetails.getAddress());
		 updateEmployee.setSalary(employeeDetails.getSalary());
		 updateEmployee.setDob(employeeDetails.getDob());
		// updateEmployee.setShop(employeeDetails.getShop());
		 this.addEmployee(updateEmployee);
		
	}

	@Override
	public void addItem(Item item) {
		// TODO Auto-generated method stub
		iItemRepository.save(item);
	}

	
}
