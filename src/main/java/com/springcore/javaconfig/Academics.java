package com.springcore.javaconfig;

public class Academics {
	private int currentSem;
	private int backlogs;
	private double cgpa;
	
	public Academics() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Academics(int currentSem, int backlogs, double cgpa) {
		super();
		System.out.println("Constructor Injection.....(Academics class)!");
		this.currentSem = currentSem;
		this.backlogs = backlogs;
		this.cgpa = cgpa;
	}

	@Override
	public String toString() {
		return "Academics [currentSem=" + currentSem + ", backlogs=" + backlogs + ", cgpa=" + cgpa + "]";
	}
	
}
