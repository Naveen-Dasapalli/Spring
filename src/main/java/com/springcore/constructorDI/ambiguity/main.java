package com.springcore.constructorDI.ambiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
	
	public static void main(String[] args){
		
		ApplicationContext context = new ClassPathXmlApplicationContext("ambiguityconfig.xml");
		Addition add = (Addition)context.getBean("add");
		Addition add1 = (Addition)context.getBean("add1");
		add.doSum();
		add1.doSum();
	}

}
