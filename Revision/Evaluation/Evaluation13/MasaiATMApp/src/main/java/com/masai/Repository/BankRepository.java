package com.masai.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.Entity.Bank;

@Repository
public interface BankRepository extends JpaRepository<Bank, Long> {

    Optional<Bank> findByName(String name);
}

