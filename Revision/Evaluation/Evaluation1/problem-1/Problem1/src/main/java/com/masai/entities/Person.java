package com.masai.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Entity
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer person_id;
	private String name;
	private String email;
	private String age;
	private String mobile;
	
	
}
