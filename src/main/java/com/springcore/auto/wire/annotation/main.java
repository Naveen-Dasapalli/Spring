package com.springcore.auto.wire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("autowireAnnotationConfig.xml");
		
		Employee e1 = (Employee) context.getBean("e1");
		
		System.out.println(e1);

		
	}

}
