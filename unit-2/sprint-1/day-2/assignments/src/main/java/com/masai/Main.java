package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		// Activate Spring Container
		ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		// Now pull the spring bean Object from container
		
		A m= ctx.getBean(A.class,"a1");
		
		m.funA();
		
		
	}
}
