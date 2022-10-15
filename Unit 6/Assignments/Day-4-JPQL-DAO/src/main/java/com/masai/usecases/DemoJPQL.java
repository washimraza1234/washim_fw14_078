package com.masai.usecases;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.masai.entity.Account;
import com.masai.utility.EMUtil;

public class DemoJPQL {
	
	public static void main(String[] args) {
		
		EntityManager em= EMUtil.provideEntityManager();
		
		String jpql="select a from Account a where a.name='Washim'";
		
		Query q= em.createQuery(jpql);
		
		List<Account> acc= q.getResultList();
		
		acc.forEach(account -> System.out.println(account));
		
	}

}
