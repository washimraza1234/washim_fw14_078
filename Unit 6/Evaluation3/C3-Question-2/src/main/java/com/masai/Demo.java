package com.masai;

import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {

	public static void main(String[] args) {

		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

		StudentService ss = ctx.getBean("studentService", StudentService.class);
		List<Student> students = ss.printList();

		students.forEach(s -> System.out.println(s));

		Map<Student, Course> theMap = ss.printMap();

		theMap.entrySet().forEach(entry -> {
			System.out.println(entry.getKey() + " " + entry.getValue());
		});

		String appName = ss.printAppName();

		System.out.println(appName);
		
		

	}

}
