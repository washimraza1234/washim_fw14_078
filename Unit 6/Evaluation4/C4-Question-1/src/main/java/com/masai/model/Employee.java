package com.masai.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer empId;
	
	@NotNull(message = "Name should not be empty")
	@NotBlank
	@NotEmpty
	private String empName;
	@NotNull
	private Integer salary;
	@NotNull
	private String address;
	@Email(message = "enter valid email address")
	private String email;
	@Size(min = 10,max = 10,message = "enter min 10 and max 10 value")
	private String mobile;
	
	@Min(8)
	private String password;
	
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}


	public Employee(Integer empId, String empName, Integer salary, String address, String email, String mobile,
			String password) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.address = address;
		this.email = email;
		this.mobile = mobile;
		this.password = password;
	}


	public Integer getEmpId() {
		return empId;
	}


	public void setEmpId(Integer empId) {
		this.empId = empId;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public Integer getSalary() {
		return salary;
	}


	public void setSalary(Integer salary) {
		this.salary = salary;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getMobile() {
		return mobile;
	}


	public void setMobile(String mobile) {
		this.mobile = mobile;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + ", address=" + address
				+ ", email=" + email + ", mobile=" + mobile + ", password=" + password + "]";
	}
	
	
	

}
