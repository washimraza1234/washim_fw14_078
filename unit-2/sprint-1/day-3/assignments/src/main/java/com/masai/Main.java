package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		PresentationBean pobj= ctx.getBean("pb",PresentationBean.class);
		
		pobj.showResult();
		
	}
}
