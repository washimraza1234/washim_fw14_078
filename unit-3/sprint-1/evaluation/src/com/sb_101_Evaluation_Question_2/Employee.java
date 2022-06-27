package com.sb_101_Evaluation_Question_2;

import java.io.Serializable;

public class Employee implements Serializable{
	private String empId;
	private String empName;
	private Address address;
	private String email;
//	private String password;
	
	transient String password;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	

	public Employee(String empId, String empName, Address address, String email, String password) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.address = address;
		this.email = email;
		this.password = password;
	}


	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", address=" + address + ", email=" + email
				+ ", password=" + password + "]";
	}
	
	
	

}
