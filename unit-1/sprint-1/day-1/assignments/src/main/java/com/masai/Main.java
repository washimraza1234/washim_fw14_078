package com.masai;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		// Activate Spring Container
		ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		// Now pull the spring bean Object from container
		
		CollegeMapTypeDependency c= ctx.getBean("cld",CollegeMapTypeDependency.class);
//		System.out.println("College name is :"+cl.getCollegeName());
		
		c.show();
		
		
//		for(Student std:s) {
//			std.showDetails();
//			System.out.println("-----------------");
//		}
		
		
		
		
	}
}
