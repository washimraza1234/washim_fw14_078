package com.masai.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int deptId;
	private String deptName;
	private String location;
	
	@OneToMany(cascade=CascadeType.ALL)
	private List<Employee> emps=new ArrayList<Employee>();
	
	
	public Department() {
		// TODO Auto-generated constructor stub
	}


	public Department(int deptId, String deptName, String location, List<Employee> emps) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.location = location;
		this.emps = emps;
	}


	public int getDeptId() {
		return deptId;
	}


	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}


	public String getDeptName() {
		return deptName;
	}


	public void setDeptName(String deptName) {
		this.deptName = deptName;
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
		return "Department [deptId=" + deptId + ", deptName=" + deptName + ", location=" + location + ", emps=" + emps
				+ "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(deptId, deptName, emps, location);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		return deptId == other.deptId && Objects.equals(deptName, other.deptName) && Objects.equals(emps, other.emps)
				&& Objects.equals(location, other.location);
	}

	
	
	

}
