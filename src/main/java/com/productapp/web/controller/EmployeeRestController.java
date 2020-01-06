package com.productapp.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.productapp.model.entities.Employee;
import com.productapp.model.service.EmployeeService;
import com.productapp.web.form.CustomResponse;

@RestController
@RequestMapping(path="api")
public class EmployeeRestController {
	
	@Autowired
	private EmployeeService empService;
	@GetMapping(path="employees",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Employee>> getAllEmployees(){
		return new ResponseEntity<List<Employee>>(empService.showAllEmployees(), HttpStatus.OK);
		
	}
	@PostMapping(path="employee",produces=MediaType.APPLICATION_JSON_VALUE,consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> addAnEmployee(@RequestBody Employee employee){
		empService.addEmployee(employee);
		CustomResponse response = new CustomResponse();
		response.setMessage("Employee added successfully");
		
		return new ResponseEntity<>(response.getMessage(), HttpStatus.CREATED);
	
	}
	@PutMapping(path="employee/{id}",produces=MediaType.APPLICATION_JSON_VALUE,consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> updateAnEmployee(@PathVariable(name="id")Long id,@RequestBody Employee employee){
		Employee emp = empService.updateEmployee(id,employee);
		System.out.println(emp);
		CustomResponse response = new CustomResponse();
		response.setMessage("Employee Details updated successfully");
		
		return new ResponseEntity<>(response.getMessage(), HttpStatus.OK);
	
	}
	@DeleteMapping(path="employee/{id}",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> deleteAnEmployee(@PathVariable(name="id")Long id){
		 empService.deleteEmployee(id);
		
		CustomResponse response = new CustomResponse();
		response.setMessage("Employee Details deleted successfully");
		
		return new ResponseEntity<>(response.getMessage(), HttpStatus.CREATED);
	
	}

}
