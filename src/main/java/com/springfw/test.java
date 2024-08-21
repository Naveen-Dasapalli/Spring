package com.springfw;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("collectionconfig.xml");
		
		Emp emp1 = (Emp)context.getBean("emp1");
		System.out.println(emp1.getEmpName());
		System.out.println(emp1.getEmpPhones());
		System.out.println(emp1.getEmpAddresses());
		System.out.println(emp1.getEmpCourses());
		System.out.println(emp1.getEmpCreadentials());
		
	}

}
