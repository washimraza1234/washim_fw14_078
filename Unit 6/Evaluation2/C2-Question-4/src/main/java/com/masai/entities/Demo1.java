package com.masai.entities;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.masai.utility.EMUtil;

public class Demo1 {
	
	
	//Write a JPQL to get all the SalariedEmployee details inside Demo1 class
	
	public static void main(String[] args) {
		
		EntityManager em= EMUtil.provideEntityManager();
		
		String jpql="from SalariedEmployee";
		
		TypedQuery<SalariedEmployee> q= em.createQuery(jpql,SalariedEmployee.class);
		
		List<SalariedEmployee> empss= q.getResultList();
		
		System.out.println(empss);
		
	}

}
