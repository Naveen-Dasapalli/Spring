package com.springcore.stereotype.component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("stereotypeConfig.xml");
		
		Student student = context.getBean("std", Student.class);
		
		System.out.print(student.getStudentName()+", ");
		System.out.print(student.getStudentAge()+", ");
		System.out.println(student.getStudentPercentage());
		System.out.println(student.getCources());
		System.out.println(student.getMarks());
		System.out.println(student.getCredentials());
	}

}
