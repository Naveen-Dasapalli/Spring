package com.referenceinjection.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("referanceconfig.xml");
		
		A temp = (A)context.getBean("aref");
		System.out.println("X: " + temp.getX());
		System.out.println("Y: " + temp.getOb().getY());
		System.out.println();
		System.out.println(temp);
	}

}
