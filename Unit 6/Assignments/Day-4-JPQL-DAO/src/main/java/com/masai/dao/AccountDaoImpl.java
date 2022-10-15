package com.masai.dao;

import javax.persistence.EntityManager;

import com.masai.entity.Account;
import com.masai.utility.EMUtil;

public class AccountDaoImpl implements AccountDao{

	@Override
	public boolean updateAccount(Account account) {
		boolean flag= false;
		
		
		EntityManager em= EMUtil.provideEntityManager();
		
		Account acc= em.find(Account.class, account.getId());
		
		if(acc == null) {
			throw new IllegalArgumentException("Invalid details...");
		}
		
		else {
			em.getTransaction().begin();
			
			em.merge(account);
			flag= true;
			
			em.getTransaction().commit();
			
			
		}
		
		em.close();
		
		return flag;
	}

}
