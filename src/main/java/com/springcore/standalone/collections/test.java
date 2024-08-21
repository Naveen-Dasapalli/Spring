package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("standaloneCollectionConfig.xml");
		
		Emp emp1 = (Emp)context.getBean("emp1");
		
		System.out.println(emp1.getEmpName().getClass().getName());
		System.out.println("------------------------------------");
		System.out.println(emp1.getEmpName());
		System.out.println();
		
		System.out.println(emp1.getEmpPhones().getClass().getName());
		System.out.println("------------------------------------");
		System.out.println(emp1.getEmpPhones());
		System.out.println();
		
		System.out.println(emp1.getEmpAddresses().getClass().getName());
		System.out.println("------------------------------------");
		System.out.println(emp1.getEmpAddresses());
		System.out.println();
		
		System.out.println(emp1.getEmpCourses().getClass().getName());
		System.out.println("------------------------------------");
		System.out.println(emp1.getEmpCourses());
		System.out.println();
		
		System.out.println(emp1.getEmpCreadentials().getClass().getName());
		System.out.println("------------------------------------");
		System.out.println(emp1.getEmpCreadentials());
		System.out.println();
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println();
		
		Emp emp2 = (Emp)context.getBean("emp2");
		
		System.out.println(emp2.getEmpName().getClass().getName());
		System.out.println("------------------------------------");
		System.out.println(emp2.getEmpName());
		System.out.println();
		
		System.out.println(emp2.getEmpPhones().getClass().getName());
		System.out.println("------------------------------------");
		System.out.println(emp2.getEmpPhones());
		System.out.println();
		
	}

}
