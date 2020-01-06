package com.productapp.model.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="employee_table")
public class Employee {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String name;
	private String job;
	public String city;
	private String type;
	private double salary;
	
	
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee(String name, String job,String city, String type, double salary) {
		super();
		this.name = name;
		this.job = job;
		this.city=city;
		this.type = type;
		this.salary = salary;
	}
	
	
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", job=" + job + ", type=" + type + ", salary=" + salary + "]";
	}
	
	

}
