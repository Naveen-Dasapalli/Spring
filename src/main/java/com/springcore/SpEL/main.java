package com.springcore.SpEL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("SpELconfig.xml");
		
		Example e = context.getBean("e", Example.class);
		
		System.out.println(e);

	}

}
