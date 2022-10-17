package com.masai.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
//@Table(name = "")
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int deptId;
	private String dname;
	private String location;
	
	
	// One to many relation with employee here
	//here One Department and many Employee
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "dept") //variable of otherside departmrnt 
	private List<Employee> emps= new ArrayList<>();
	
	
	public Department() {
		// TODO Auto-generated constructor stub
	}


	public Department(int deptId, String dname, String location, List<Employee> emps) {
		super();
		this.deptId = deptId;
		this.dname = dname;
		this.location = location;
		this.emps = emps;
	}


	public int getDeptId() {
		return deptId;
	}


	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}


	public String getDname() {
		return dname;
	}


	public void setDname(String dname) {
		this.dname = dname;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public List<Employee> getEmps() {
		return emps;
	}


	public void setEmps(List<Employee> emps) {
		this.emps = emps;
	}


	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", dname=" + dname + ", location=" + location + ", emps=" + emps + "]";
	}
	
	

}
