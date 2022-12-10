package com.masai.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
//import javax.validation.constraints.Email;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Entity
public class Email {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer EmailID;
	
	@javax.validation.constraints.Email
	private String email;
	
	private List<Email> starredEmail= new ArrayList<Email>();
	
	@NotNull
	private String password;
	
	
	@OneToOne(cascade = CascadeType.ALL,mappedBy = "email")
	private User user;
	

}
