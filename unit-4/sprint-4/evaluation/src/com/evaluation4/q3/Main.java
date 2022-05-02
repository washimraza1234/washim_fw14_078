package com.evaluation4.q3;

public class Main {
	
	public static void main(String[] args) {
		Employee emp= new Employee();
		emp.setEmpName("emp");
		emp.setEmail("emp-1@gmail.com");
		emp.setEmpId("emp-1");
		emp.setAddress(new Address());
		emp.setPassword("emp123");
		
		System.out.println(emp.getEmail());
		System.out.println(emp.getEmpId());
	}

}
