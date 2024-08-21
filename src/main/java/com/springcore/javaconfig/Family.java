package com.springcore.javaconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Family {
	private int noOfMembers;

	public Family() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getNoOfMembers() {
		return noOfMembers;
	}

	@Value("${family.noOfMembers}")
	public void setNoOfMembers(int noOfMembers) {
		System.out.println("Setter Injection.....(Family class)!");
		this.noOfMembers = noOfMembers;
	}

	@Override
	public String toString() {
		return "Family [noOfMembers=" + noOfMembers + "]";
	}

}
