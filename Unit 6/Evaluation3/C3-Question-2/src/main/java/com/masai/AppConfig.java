package com.masai;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.masai")
@PropertySource("a1.properties")
public class AppConfig {
	
	@Bean
	public List<Student> theList(){
		
		List<Student> theList = new ArrayList<>();
		theList.add(new Student(1, "Washim", "Kolkata", "washim@gmail.com", 800));
		theList.add(new Student(2, "Amit", "BLR", "amit@gmail.com", 700));
		theList.add(new Student(3, "Riya", "HWH", "riya@gmail.com", 600));
		theList.add(new Student(4, "Ayan", "SDEH", "ayan@gmail.com", 800));
		theList.add(new Student(5, "Kuheli", "HYD", "kuheli@gmail.com", 900));
		
		
		return theList;
	}
	
	@Bean
	public Map<Student, Course> theMap(){
		
		Map<Student, Course> theMap= new HashMap<Student, Course>();
		
		theMap.put(new Student(1, "Washim", "Kolkata", "washim@gmail.com", 800), new Course(1, "Java", "2 Yrs", 1222.00));
		
		theMap.put(new Student(2, "Amit", "BLR", "amit@gmail.com", 700), new Course(2, "C++", "1 Yrs", 1000.00));
		
		theMap.put(new Student(3, "Riya", "HWH", "riya@gmail.com", 600), new Course(3, "Python", "0.5 Yrs", 1200.00));
		
		
		return theMap;
	}

}
