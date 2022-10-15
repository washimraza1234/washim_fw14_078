package com.masai.usecases;

import javax.persistence.EntityManager;

import com.masai.entity.Account;
import com.masai.utility.EMUtil;

public class SaveUsecase {
	
	public static void main(String[] args) {
		
		EntityManager em= EMUtil.provideEntityManager();
		
		Account acc= new Account();
		Account acc1= new Account();
		Account acc2= new Account();
		
		acc.setName("WAshim");
		acc1.setName("Rahul");
		acc2.setName("Kuheli");
		
		em.getTransaction().begin();
		em.persist(acc);
		em.persist(acc1);
		em.persist(acc2);
		em.getTransaction().commit();
		em.close();
		
		System.out.println("Saved...");
	}

}
