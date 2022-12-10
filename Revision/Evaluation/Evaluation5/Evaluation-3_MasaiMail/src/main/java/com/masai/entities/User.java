package com.masai.entities;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer userId;
	
	@NotBlank
	private String firstName;
	@NotBlank
	private String lastName;
	
	@Min(value = 10)
	@Max(value = 10)
	private String mobileNumber;
	
	@Past
	private LocalDate dateOfBirth;
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "user")
	private Email email;

}
