package com.masai.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exceptions.AccountException;
import com.masai.exceptions.InsufficientFundException;
import com.masai.model.Account;
import com.masai.model.AccountDTO;
import com.masai.repository.AccountRepo;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountRepo dao;

	@Override
	public Account openAccount(Account acc) throws AccountException {
		Account account = dao.save(acc);

		if (account != null) {
			return account;
		} else
			throw new AccountException("Account not opened..");
	}

	@Override
	public Account closeAccount(Integer accno) throws AccountException {
		Optional<Account> opt = dao.findById(accno);

		if (opt.isPresent()) {
			Account existingAcc = opt.get();
			dao.delete(existingAcc);
			return existingAcc;
		}

		else
			throw new AccountException("No account available with accno:" + accno);
	}

	@Override
	public Account depositAmount(Integer accno, Integer amount) throws AccountException {
		Optional<Account> acc = dao.findById(accno);

		if (acc.isPresent()) {
			Account existingAcc = acc.get();
			existingAcc.setBalance(existingAcc.getBalance() + amount);
			return dao.save(existingAcc);

		} else
			throw new AccountException("Account not available with Account No: " + accno);

	}

	@Override
	public Account withdrawAmount(Integer accno, Integer amount) throws AccountException, InsufficientFundException {
		Optional<Account> opt = dao.findById(accno);

		if (opt.isPresent()) {
			Account existingAcc = opt.get();
			if (existingAcc.getBalance() < amount) {
				throw new InsufficientFundException("Insufficient fund on your account no: " + accno);
			} else {
				existingAcc.setBalance(existingAcc.getBalance() - amount);
				return dao.save(existingAcc);
			}

		} else
			throw new AccountException("Enter a valid Account number");

	}

	@Override
	public String transferAmount(AccountDTO dto) throws AccountException, InsufficientFundException {
		// TODO Auto-generated method stub

		return null;
	}

}
