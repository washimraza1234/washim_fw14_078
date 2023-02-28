package com.masai.Service;

import java.awt.print.Pageable;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import javax.security.auth.login.AccountNotFoundException;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Sort;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.masai.Entity.Account;
import com.masai.Entity.User;
import com.masai.Repository.BankRepository;
import com.masai.Repository.UserRepository;

@Service
public class UserService {

    private final UserRepository userRepository;

    private final BankRepository bankRepository;

    public UserService(UserRepository userRepository, BankRepository bankRepository) {
        this.userRepository = userRepository;
        this.bankRepository = bankRepository;
    }

    public User registerUser(User user) {
        return userRepository.save(user);
    }

    public User loginUser(String mobileNumber, String password) throws AccountNotFoundException {
        return userRepository.findByMobileNumber(mobileNumber)
                .orElseThrow(() -> new AccountNotFoundException("Invalid mobile number or password"));
    }

    public Account openAccount(Account account) {
        Optional<User> optionalUser = userRepository.findById(account.getId());
        if (optionalUser.isPresent()) {
            User user = optionalUser.get();
            if (user.getAccountByBank(account.getBank()) != null) {
                throw new Exception("User already has an account with this bank");
            }
            account.setAccountOpen(LocalDateTime.now());
            user.addAccount(account);
            userRepository.save(user);
            return account;
        } else {
            throw new Exception("User not found with id " + account.getId());
        }
    }

    public Account depositMoney(Long accountId, Integer amount) {
        Optional<Account> optionalAccount = bankRepository.findAccountById(accountId);
        if (optionalAccount.isPresent()) {
            Account account = optionalAccount.get();
            account.setBalance(account.getBalance() + amount);
            return bankRepository.save(account);
        } else {
            throw new Exception("Account not found with id " + accountId);
        }
    }

    public void transferMoney(Long sourceAccountId, Long destinationAccountId, Integer amount) {
        Optional<Account> optionalSourceAccount = bankRepository.findAccountById(sourceAccountId);
        Optional<Account> optionalDestinationAccount = bankRepository.findAccountById(destinationAccountId);

        if (optionalSourceAccount.isPresent() && optionalDestinationAccount.isPresent()) {
            Account sourceAccount = optionalSourceAccount.get();
            Account destinationAccount = optionalDestinationAccount.get();

            if (sourceAccount.getBalance() < amount) {
                throw new Exception("Insufficient balance in the source account");
            }

            sourceAccount.setBalance(sourceAccount.getBalance() - amount);
            destinationAccount.setBalance(destinationAccount.getBalance() + amount);

            bankRepository.saveAll(Arrays.asList(sourceAccount, destinationAccount));
        } else {
            throw new AccountNotFoundException("Source or destination account not found");
        }
    }

    public List<User> getAllUsers(String fieldName, String sortOrder) {
        Sort sort = Sort.by(sortOrder.equals("asc") ? Sort.Direction.ASC : Sort.Direction.DESC, fieldName);
        return (List<User>) userRepository.findAll(sort);
    }

    public List<User> getUsersByPage(int pageNo, int noOfRecords) {
        PageRequest pageable = PageRequest.of(pageNo - 1, noOfRecords);
        return userRepository.findAll(pageable).getContent();
    }

    public List<User> getUsersByPageAndSort(int pageNo, int noOfRecords, String fieldName, String sortOrder) {
        Sort sort = Sort.by(sortOrder.equals("asc") ? Sort.Direction.ASC : Sort.Direction.DESC, fieldName);
        Pageable pageable = PageRequest.of(pageNo - 1, noOfRecords, sort);
        return userRepository.findAll(pageable).getContent();
    }

	

}
