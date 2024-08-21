package com.springcore.javaconfig;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:javaConfig.properties")
@ComponentScan(basePackages = "com.springcore.javaconfig")
public class Config {
	
	@Value("${academics.currentSem}")
	private int currentSem;
	
	@Value("${academics.backlogs}")
	private int backlogs;
	
	@Value("${academics.cgpa}")
	private double cgpa;
	
	@Bean
	public Address address() {
		Address address = new Address();
		return address;
	}
	
	@Bean
	public Student student(
			@Value("${student.name}") String name,
			@Value("${student.age}") int age,
			@Value("${student.cources}") List<String> cources,
			Address address, Academics academics) {
		return new Student(name, age, cources, address, academics);
	}
	
	@Bean
	public Academics academics(){
		return new Academics(currentSem, backlogs, cgpa);
		
	}

}
