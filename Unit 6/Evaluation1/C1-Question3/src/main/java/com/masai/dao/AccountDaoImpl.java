package com.masai.dao;

import javax.persistence.EntityManager;

import com.masai.entities.Account;
import com.masai.utility.EMUtil;

public class AccountDaoImpl implements AccountDao {

	@Override
	public Account findById(int id) {
		Account acc = null;

		EntityManager em = EMUtil.provideEntityManager();

		acc = em.find(Account.class, em);

		return acc;

	}

	@Override
	public String save(Account account) {
		String msg = "Enter valid details...";

		EntityManager em = EMUtil.provideEntityManager();

		em.getTransaction().begin();

		em.persist(account);

		msg = "Account Saved...!";

		em.getTransaction().commit();

		em.close();

		return msg;
	}

	@Override
	public String deleteAccountById(int id) {
		String msg = "";

		EntityManager em = EMUtil.provideEntityManager();

		Account acc = em.find(Account.class, id);

		if (acc != null) {
			em.getTransaction().begin();

			em.remove(acc);
			msg = "Account deleted...";
			em.getTransaction().commit();

			em.close();
		} else {
			System.out.println("No Students Available");
		}

		return msg;
	}

	@Override
	public String withdraw(double amount, int accountId) {

		String msg = "";

		EntityManager em = EMUtil.provideEntityManager();

		Account acc = em.find(Account.class, accountId);

		if (acc != null) {
			em.getTransaction().begin();

			em.persist(acc.getBalance() - amount);

			em.persist(acc);

			msg = "Amount of :" + amount + " withdrawn";

			em.getTransaction().commit();

			em.close();
		}

		return msg;

	}

	@Override
	public String deposit(double amount, int accountId) {
		String msg = "";

		EntityManager em = EMUtil.provideEntityManager();

		Account acc = em.find(Account.class, accountId);

		if (acc != null) {

			em.getTransaction().begin();

			em.persist(acc.getBalance()-amount);

			em.persist(acc);

			msg = "Amount of :" + amount + " deposited";

			em.getTransaction().commit();

			em.close();
		}

		return msg;
	}

}
