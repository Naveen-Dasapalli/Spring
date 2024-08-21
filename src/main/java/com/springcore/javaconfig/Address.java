package com.springcore.javaconfig;

import org.springframework.beans.factory.annotation.Value;

public class Address {
	
	
	private String flatNo;
	private String AppartmentName;
	private String Area;
	private String Street;
	private String city;
	
	public String getFlatNo() {
		return flatNo;
	}
	
	@Value("${address.flatNo}")
	public void setFlatNo(String flatNo) {
		System.out.println("Setter Injection.....(Address class)!");
		this.flatNo = flatNo;
	}
	public String getAppartmentName() {
		return AppartmentName;
	}
	
	@Value("${address.AppartmentName}")
	public void setAppartmentName(String appartmentName) {
		AppartmentName = appartmentName;
	}
	public String getArea() {
		return Area;
	}
	
	@Value("${address.Area}")
	public void setArea(String area) {
		Area = area;
	}
	public String getStreet() {
		return Street;
	}
	
	@Value("${address.Street}")
	public void setStreet(String street) {
		Street = street;
	}
	public String getCity() {
		return city;
	}
	
	@Value("${address.city}")
	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "Address [flatNo=" + flatNo + ", AppartmentName=" + AppartmentName + ", Area=" + Area + ", Street="
				+ Street + ", city=" + city + "]";
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

}
