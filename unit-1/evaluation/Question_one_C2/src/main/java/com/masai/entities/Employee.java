package com.masai.entities;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int empId;
	private String empName;
	private int salary;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private Department dept;
	
	


	@Embedded
	@ElementCollection
	private Set<Address> address = new HashSet<Address>();
	
	
	
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}


	public Employee(int empId, String empName, int salary, Department dept, Set<Address> address) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.dept = dept;
		this.address = address;
	}


	public int getEmpId() {
		return empId;
	}




	public void setEmpId(int empId) {
		this.empId = empId;
	}




	public String getEmpName() {
		return empName;
	}




	public void setEmpName(String empName) {
		this.empName = empName;
	}




	public int getSalary() {
		return salary;
	}




	public void setSalary(int salary) {
		this.salary = salary;
	}




	public Department getDept() {
		return dept;
	}




	public void setDept(Department dept) {
		this.dept = dept;
	}




	public Set<Address> getAddress() {
		return address;
	}




	public void setAddress(Set<Address> address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + ", dept=" + dept
				+ ", address=" + address + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(address, dept, empId, empName, salary);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(address, other.address) && Objects.equals(dept, other.dept) && empId == other.empId
				&& Objects.equals(empName, other.empName) && salary == other.salary;
	}




	


	
	
	

}
