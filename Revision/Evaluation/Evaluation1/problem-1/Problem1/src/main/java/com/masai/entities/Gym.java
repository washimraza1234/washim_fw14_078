package com.masai.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
@Entity
public class Gym {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer gym_id;
	private String gym_name;
	private String monthly_fee;
	
	

}
