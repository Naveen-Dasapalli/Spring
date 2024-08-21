package com.springcore.stereotype.component;

import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("std") // or @component
public class Student {
	
	@Value("Naveen")
	private String studentName;
	
	@Value("24")
	private int studentAge;
	
	@Value("89.45")
	private double studentPercentage;
	
	@Value("#{cources}")
	private List<String> Cources;
	
	@Value("#{marks}")
	private Map<String, Integer> marks;
	
	@Value("#{credentials}")
	private Properties credentials;
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentAge() {
		return studentAge;
	}
	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}
	public double getStudentPercentage() {
		return studentPercentage;
	}
	public void setStudentPercentage(double studentPercentage) {
		this.studentPercentage = studentPercentage;
	}
	public List<String> getCources() {
		return Cources;
	}
	public void setCources(List<String> cources) {
		Cources = cources;
	}
	public Map<String, Integer> getMarks() {
		return marks;
	}
	public void setMarks(Map<String, Integer> marks) {
		this.marks = marks;
	}
	public Properties getCredentials() {
		return credentials;
	}
	public void setCredentials(Properties credentials) {
		this.credentials = credentials;
	}
}
