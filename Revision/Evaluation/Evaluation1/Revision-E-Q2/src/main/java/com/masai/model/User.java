package com.masai.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class User {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id; 
	private String name;
	private String phoneNo;
	private String dateOfBirth;
	
	@OneToOne(cascade = CascadeType.ALL,mappedBy = "user")
	private Email email;

}
