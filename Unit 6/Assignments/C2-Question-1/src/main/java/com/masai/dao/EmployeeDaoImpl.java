package com.masai.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.masai.entities.Department;
import com.masai.entities.Employee;
import com.masai.exceptions.DepartmentException;
import com.masai.exceptions.EmployeeException;
import com.masai.utility.EMUtil;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public void addDepartment(Department dept) {

		EntityManager em = EMUtil.provideEntityManager();

		em.getTransaction().begin();

		em.persist(dept);
		System.out.println("Department Added successfully...");
		em.getTransaction().commit();

		em.close();

	}

	@Override
	public void addEmployee(Employee emp) {
		EntityManager em = EMUtil.provideEntityManager();

		em.getTransaction().begin();

		em.persist(emp);
		System.out.println("Employee Added successfully...");
		em.getTransaction().commit();

		em.close();

	}

	@Override
	public void registerEmployeeTODepartment(int empId, int deptId) throws EmployeeException, DepartmentException {

		EntityManager em = EMUtil.provideEntityManager();

		Department dept = em.find(Department.class, deptId);

		Employee emp = em.find(Employee.class, empId);

		if (dept == null) {
			throw new DepartmentException("Department ID is invalid..");
		} else {
			

			if (emp == null) {
				throw new EmployeeException("Employee details not Available");
			}

			dept.getEmps().add(emp);

			em.getTransaction().begin();

			em.persist(emp);

			System.out.println("Successfully Registered...");

			em.getTransaction().commit();
		}

		em.close();
	}

	@Override
	public List<Employee> getAllEmployeeWithDeptName(String deptName) throws EmployeeException {
		EntityManager em = EMUtil.provideEntityManager();

		String jpql = "select emps from Department where deptName=:nm";

		Query q = em.createQuery(jpql);
		
		q.setParameter("nm", deptName);

		List<Employee> allemps = q.getResultList();
		
		if(allemps==null) {
			throw new EmployeeException("No data Available");
		}

		else
			
		return allemps;
	}

	@Override
	public Department getDepartmentDetailsByEmployeeId(int empId) throws DepartmentException {
		EntityManager em = EMUtil.provideEntityManager();

		String jpql = "select dept from Employee where empId=:id";

		Query q = em.createQuery(jpql);
		
		q.setParameter("id", empId);

		Department dept = (Department)q.getSingleResult();
		
		if(dept==null) {
			throw new DepartmentException("No data Available");
		}

		else
			
		return dept;
	}

}
