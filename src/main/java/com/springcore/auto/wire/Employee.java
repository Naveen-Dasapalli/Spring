package com.springcore.auto.wire;

public class Employee {
	private Address address;

	public Employee(Address address) {
		super();
		System.out.println("Constructor Injectioin....");
		this.address = address;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		System.out.println("Setter Injectioin....");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}

}
