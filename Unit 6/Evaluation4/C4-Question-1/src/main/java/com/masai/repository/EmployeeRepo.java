package com.masai.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.masai.model.Employee;
import com.masai.model.EmployeeDTO;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

	List<Employee> findByAddress(String address);
	
	@Query("select e.empName, e.address from Employee e where e.empId=?1")
	public String getNameAndAddrbyID( Integer empid);
	
	@Query("select new com.masai.model.EmployeeDTO(e.empName,e.address,e.salary) from Employee e" )
	public List<EmployeeDTO> getNameAddressSalaryOfAllEmp();
	
	

}
