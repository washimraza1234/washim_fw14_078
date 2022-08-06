package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
		// Activating spring container
		
		ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Pull spring container object
		
		Circle tr= ctx.getBean(Circle.class,"c");
		
		tr.draw();
		
		
	}

}
