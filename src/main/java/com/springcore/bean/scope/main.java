package com.springcore.bean.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("beanScopeConfig.xml");
		
		Student student1 = context.getBean("student2", Student.class);
		Student student2 = context.getBean("student2", Student.class);
		
		Student std1 = context.getBean("student1", Student.class);
		Student std2 = context.getBean("student1", Student.class);
		
		System.out.println(student1.hashCode());
		System.out.println(student2.hashCode());
		
		System.out.println();
		
		System.out.println(std1.hashCode());
		System.out.println(std2.hashCode());
		System.out.println();
		
		Person person1 = context.getBean("person", Person.class);
		Person person2 = context.getBean("person", Person.class);
		
		System.out.println(person1.hashCode());
		System.out.println(person2.hashCode());
	}

}
