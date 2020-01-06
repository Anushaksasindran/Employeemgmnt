package com.productapp.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.productapp.model.entities.Employee;
import com.productapp.model.exceptions.EmployeeNotFoundException;
import com.productapp.model.repositories.EmployeeRepo;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	
	private EmployeeRepo repo;

	@Override
	public void addEmployee(Employee emp) {
		repo.save(emp);
		
	}

	@Override
	public Employee deleteEmployee(Long id) {
		Employee e = repo.findById(id).orElseThrow(EmployeeNotFoundException::new);
		repo.delete(e);
		
		return e;
	}
	

	@Override
	public List<Employee> showAllEmployees() {
		return repo.findAll();
	}

	@Override
	public Employee updateEmployee(Long id,Employee e) {
		Employee empToBeUpdated = repo.findById(id).orElseThrow(EmployeeNotFoundException::new);
		empToBeUpdated.setSalary(e.getSalary());
		return empToBeUpdated;
		
		
	}
	
	

}
