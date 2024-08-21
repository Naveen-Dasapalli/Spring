package com.springcore.javaconfig;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Student {
	
	private String name;
	private int age;
	private List<String> cources;
	private Address address;
	private Academics academics;
	private Family family;
	
	public Family getFamily() {
		return family;
	}
	
	@Autowired
	public void setFamily(Family family) {
		this.family = family;
	}

	public Student(String name, int age, List<String> cources, Address address, Academics academics) {
		super();
		System.out.println("Constructor Injection.....(Student class)!");
		this.name = name;
		this.age = age;
		this.cources = cources;
		this.address = address;
		this.academics = academics;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", cources=" + cources + ", address=" + address
				+ ", academics=" + academics + ", family=" + family + "]";
	}
}
