package com.masai.dao;

import javax.persistence.EntityManager;

import com.masai.entities.Account;
import com.masai.utility.EMUtility;

public class AccountDaoImpl implements AccountDao {

	@Override
	public Account findById(int id) {
		Account acc = null;

		EntityManager em = EMUtility.provideEntityManager();
		acc = em.find(Account.class, id);

		return acc;
	}

	@Override
	public String save(Account account) {
		String msg="";
		EntityManager em = EMUtility.provideEntityManager();
		em.getTransaction().begin();

		em.persist(account);

		msg="Account Created...";

		em.getTransaction().commit();

		em.close();

		return msg;
	}

	@Override
	public String update(Account account) {
		String msg="";

		EntityManager em = EMUtility.provideEntityManager();

		em.getTransaction().begin();

		em.merge(account);

		msg= "Account updated....!!";

		em.getTransaction().commit();

		em.close();

		return msg;
	}

	@Override
	public String remove(int id) {
		String msg="Account not found...";

		EntityManager em = EMUtility.provideEntityManager();

		Account acc = em.find(Account.class, id);

		if (acc != null) {
			em.getTransaction().begin();

			em.remove(acc);

			msg="Account Removed....";

			em.getTransaction().commit();

		}

		em.close();

		return msg;
	}

	@Override
	public String withdraw(double amount, int accountId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deposit(double amount, int accountId) {
		// TODO Auto-generated method stub
		return null;
	}

}
