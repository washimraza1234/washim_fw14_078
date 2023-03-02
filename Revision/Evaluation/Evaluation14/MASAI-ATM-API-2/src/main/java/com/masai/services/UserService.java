package com.masai.services;

import java.util.List;

import javax.security.auth.login.AccountNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.Exception.UserNotFoundException;
import com.masai.entities.Account;
import com.masai.entities.User;
import com.masai.repository.AccountRepository;
import com.masai.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private AccountRepository accountRepository;
    
    
    

    
    public User addUser(User user) {
        return userRepository.save(user);
    }

    public User getUserById(Long id) throws UserNotFoundException{
        return userRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException("User not found with id: " + id));
    }

    public User updateUser(Long id, User user) throws UserNotFoundException {
        User existingUser = getUserById(id);
        existingUser.setFirstName(user.getFirstName());
        existingUser.setLastName(user.getLastName());
        existingUser.setMobileNumber(user.getMobileNumber());
        existingUser.setAddress(user.getAddress());
        existingUser.setAge(user.getAge());
        existingUser.setGender(user.getGender());
        return userRepository.save(existingUser);
    }

    public void deleteUserById(Long id) throws UserNotFoundException {
        User existingUser = getUserById(id);
        userRepository.delete(existingUser);
    }

    public List<Account> getAllAccounts() {
        return accountRepository.findAll();
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

    public List<Account> getAllAccountsByUser(Long userId) {
        User user = getUserById(userId);
        return user.getAccounts();
    }

    public Account addAccountToUser(Long userId, Account account) {
        User user = getUserById(userId);
        account.setUser(user);
        return accountRepository.save(account);
    }
}
