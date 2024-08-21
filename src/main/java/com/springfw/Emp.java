package com.springfw;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Emp {
	
	private String empName;
	private List empPhones;
	private Set empAddresses;
	private Map empCourses;
	private Properties empCreadentials;
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public List getEmpPhones() {
		return empPhones;
	}
	public void setEmpPhones(List empPhones) {
		this.empPhones = empPhones;
	}
	public Set getEmpAddresses() {
		return empAddresses;
	}
	public void setEmpAddresses(Set empAddresses) {
		this.empAddresses = empAddresses;
	}
	public Map getEmpCourses() {
		return empCourses;
	}
	public void setEmpCourses(Map empCourses) {
		this.empCourses = empCourses;
	}
	public Properties getEmpCreadentials() {
		return empCreadentials;
	}
	public void setEmpCreadentials(Properties empCreadentials) {
		this.empCreadentials = empCreadentials;
	}
	public Emp(String empName, List empPhones, Set empAddresses, Map empCourses, Properties empCreadentials) {
		super();
		this.empName = empName;
		this.empPhones = empPhones;
		this.empAddresses = empAddresses;
		this.empCourses = empCourses;
		this.empCreadentials = empCreadentials;
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Emp [empName=" + empName + ", empPhones=" + empPhones + ", empAddress=" + empAddresses + ", empCourser="
				+ empCourses + ", empCreadentials=" + empCreadentials + "]";
	}
	

}
