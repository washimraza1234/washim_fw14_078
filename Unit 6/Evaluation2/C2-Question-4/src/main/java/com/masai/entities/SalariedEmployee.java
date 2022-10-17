package com.masai.entities;

import javax.persistence.Entity;

@Entity
public class SalariedEmployee extends Employee{

	private Integer salary;
	private String email;
	
	
	public SalariedEmployee() {
		// TODO Auto-generated constructor stub
	}


	public SalariedEmployee(Integer salary, String email) {
		super();
		this.salary = salary;
		this.email = email;
	}


	public Integer getSalary() {
		return salary;
	}


	public void setSalary(Integer salary) {
		this.salary = salary;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return "SalariedEmployee [salary=" + salary + ", email=" + email + "]";
	}
	
	
	
	
}
