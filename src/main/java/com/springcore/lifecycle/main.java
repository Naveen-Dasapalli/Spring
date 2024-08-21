package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifecycleConfig.xml");
		Samosa s1 = (Samosa) context.getBean("s1");
		Pepsi p1 = (Pepsi) context.getBean("p1");
		Example subject1 = (Example) context.getBean("subject1");

		System.out.println(s1);
		System.out.println(p1);
		System.out.println(subject1);

		context.registerShutdownHook();

	}

}
