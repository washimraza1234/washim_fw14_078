package com.masai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.AccountException;
import com.masai.model.Account;
import com.masai.repository.AccountDao;


@Service
public class AccountServiceImpl implements AccountService{

	
	@Autowired
	private AccountDao dao;
	
	
	@Override
	public Account openAccount(Account acc) throws AccountException {
		Account ac= dao.save(acc);
		
		if(ac != null) {
			return ac;
		}
		else
			throw new AccountException("Something went wrong");
	}

}
