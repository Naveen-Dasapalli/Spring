package com.springcore.constructorDI;

import java.util.List;

public class Person {
	private String name;
	private int personID;
	private Certificate certificate;
	private List<String> courses;
	
	public Person(String name, int personID, Certificate certificate, List<String> courses) {
		this.name = name;
		this.personID = personID;
		this.certificate = certificate;
		this.courses = courses;
	}

	@Override
	public String toString() {
		
		return "[Person Name:" + this.name + "] [Person ID:" + this.personID +"] ["+ this.certificate + "]" + this.courses;
	}
	
	
	

}
