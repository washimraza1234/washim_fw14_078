package com.masai.services;

import java.util.List;

import javax.security.auth.login.AccountNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.entities.Account;
import com.masai.repository.AccountRepository;

@Service
public class AccountService {
    @Autowired
    private AccountRepository accountRepository;

    public Account addAccount(Account account) {
        return accountRepository.save(account);
    }

    public Account getAccountById(Long id) throws AccountNotFoundException {
        return accountRepository.findById(id)
                .orElseThrow(() -> new AccountNotFoundException("Account not found with id: " + id));
    }

    public Account updateAccount(Long id, Account account) throws AccountNotFoundException {
        Account existingAccount = getAccountById(id);
        existingAccount.setAccountNo(account.getAccountNo());
        existingAccount.setIfsc(account.getIfsc());
        existingAccount.setAccountOpen(account.getAccountOpen());
        existingAccount.setBalance(account.getBalance());
        existingAccount.setBank(account.getBank());
        return accountRepository.save(existingAccount);
    }

    public void deleteAccountById(Long id) throws AccountNotFoundException {
        Account existingAccount = getAccountById(id);
        accountRepository.delete(existingAccount);
    }

    public List<Account> getAllAccounts() {
        return accountRepository.findAll();
    }

    public List<Account> getAllAccountsByUser(Long userId) {
        throw new UnsupportedOperationException("This operation is not supported");
    }

    public Account addAccountToUser(Long userId, Account account) {
        throw new UnsupportedOperationException("This operation is not supported");
    }
}
