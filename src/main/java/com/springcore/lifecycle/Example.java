package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example {
	private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Example() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Example [subject=" + subject + "]";
	}

	@PostConstruct
	public void init() {
		System.out.println("Inializing the Example bean....");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("Cleaning up the config before Example bean distruction");
	}

}
