package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
public static void main(String[] args) {
		
		//Activates container...
		ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Shape obj= ctx.getBean("sp", Shape.class);
		obj.draw();
		
		
	}

}
