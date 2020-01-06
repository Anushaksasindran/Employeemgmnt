package com.productapp.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.productapp.model.entities.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long>{

}
