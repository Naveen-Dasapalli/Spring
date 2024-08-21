package com.springcore.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	
	@Autowired
	@Qualifier("address1")
	private Address address;
	
	//@Autowired
	public Employee(Address address) {
		super();
		System.out.println("Construction Injection......");
		this.address = address;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Address getAddress() {
		return address;
	}
	
	//@Autowired
	public void setAddress(Address address) {
		System.out.println("Setter Injection......");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}

}
