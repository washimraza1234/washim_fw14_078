package com.masai;

import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.masai.entities.Gym;
import com.masai.entities.Person;
import com.masai.service.PersonServiceImpl;

@SpringBootApplication
public class Problem1Application {

	public static void main(String[] args) {
		SpringApplication.run(Problem1Application.class, args);
		
		
		PersonServiceImpl serviceImpl= new PersonServiceImpl();
		
		serviceImpl.printMap();
		serviceImpl.printList();
		serviceImpl.printAppName();
		
		
		
	}
	
	

}
