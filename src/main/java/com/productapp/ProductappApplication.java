package com.productapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.productapp.model.entities.Employee;
import com.productapp.model.repositories.EmployeeRepo;

@SpringBootApplication
public class ProductappApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ProductappApplication.class, args);
	}
	@Autowired
	private EmployeeRepo employeeRepo;
	

	@Override
	public void run(String... args) throws Exception {
	/*Employee e1 = new Employee("anusha","software engineer","mumbai","temp", 25000);
	
	employeeRepo.save(e1);
		Employee e2 = new Employee("anu","software engineer","mumbai","temp", 26000);
		
		employeeRepo.save(e2);
		Employee e3 = new Employee("shylu","software engineer","bangalore","temp", 28000);
		
		employeeRepo.save(e3);*/
	}
}
