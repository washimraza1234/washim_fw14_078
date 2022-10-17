package com.masai.entities;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.masai.utility.EMUtil;

public class Demo2 {

	//Write a JPQL to get all the ContractualEmployee details inside Demo2 class
	
	public static void main(String[] args) {
		
		EntityManager em= EMUtil.provideEntityManager();
		
		String jpql="from ConractualEmployee";
		
		TypedQuery<ConractualEmployee> q= em.createQuery(jpql,ConractualEmployee.class);
		
		List<ConractualEmployee> emps= q.getResultList();
		System.out.println(emps);
		
	}
}
