package com.productapp.web.form;

public class Response {
	
	private String job;
	private String salary;
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public Response(String job, String salary) {
		super();
		this.job = job;
		this.salary = salary;
	}
	public Response() {
		super();
	}
	
	

}
