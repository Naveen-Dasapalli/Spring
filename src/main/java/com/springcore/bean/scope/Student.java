package com.springcore.bean.scope;

public class Student {
	private String studentName;

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + "]";
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
}
