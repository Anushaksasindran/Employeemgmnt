package com.productapp.model.service;

import java.util.List;

import com.productapp.model.entities.Employee;

public interface EmployeeService{
	
	public void addEmployee(Employee emp);
	public Employee deleteEmployee(Long id);
	public List<Employee> showAllEmployees();
	public Employee updateEmployee(Long id,Employee e);
	
	
	
	
	
	
}
