package com.masai.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.masai.exception.ProductException;

public class Demo {
	
	public static void main(String[] args) throws ProductException {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Presentation p= ctx.getBean("cont",Presentation.class);
		
		p.insertProduct();
		p.printAllProduct();
		p.searchProduct();
		p.GetProductsWithingPriceRange();
		
	}

}
