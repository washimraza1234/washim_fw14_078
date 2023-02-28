package com.masai.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.Entity.Bank;

@RestController
@RequestMapping("/masaiAtm")
public class BankController {

    @Autowired
    private Bank bankService;

    @PostMapping("/bank")
    public ResponseEntity<Bank> createBank(@RequestBody Bank bank) {
        Bank newBank = bankService.createBank(bank);
        return new ResponseEntity<>(newBank, HttpStatus.CREATED);
    }

    @GetMapping("/banks")
    public ResponseEntity<List<Bank>> getAllBanks() {
        List<Bank> banks = bankService.getAllBanks();
        return new ResponseEntity<>(banks, HttpStatus.OK);
    }
}
