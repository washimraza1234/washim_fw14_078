package com.masai.service;

import com.masai.exception.AccountException;
import com.masai.model.Account;

public interface AccountService {
	
	public Account openAccount(Account acc)throws AccountException;


}
