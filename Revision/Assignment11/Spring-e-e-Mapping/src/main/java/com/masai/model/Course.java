package com.masai.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Course {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer courseID;
	private String courseName;
	private Integer fee;
	
	
	@ManyToMany(cascade = CascadeType.ALL,mappedBy = "courses")
	private Set<Student> students= new HashSet<>();
	
	
	
	

}
