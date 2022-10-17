package com.masai.entities;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.masai.utility.EMUtil;

public class Demo2 {
	
	public static void main(String[] args) {
		
		
		EntityManager em= EMUtil.provideEntityManager();
		
		String jpql= "select emps from Department where dname=:dn";
		
		Query q= em.createQuery(jpql);
		
		q.setParameter("dn", "HR");
		
		List<Employee> empss= q.getResultList();
		
		empss.forEach(emp->System.out.println(emp));
		
		System.out.println("Done");
		
		
		
	}

}
