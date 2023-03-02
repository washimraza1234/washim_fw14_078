package com.masai.entities;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "accounts")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Account number is required")
    @Column(name = "account_no")
    private String accountNo;

    @NotBlank(message = "IFSC code is required")
    private String ifsc;

    @NotNull(message = "Account open date time is required")
    @Column(name = "account_open")
    private LocalDateTime accountOpen;

    @NotNull(message = "Balance is required")
    @Min(value = 0, message = "Balance must be a positive value")
    private Integer balance;

    @NotBlank(message = "Bank name is required")
    private String bank;

    
}
