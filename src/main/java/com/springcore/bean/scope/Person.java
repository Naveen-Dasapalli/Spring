package com.springcore.bean.scope;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype") // by default Scope will be singleton
public class Person {
	
	@Value("Naveen")
	private String name;

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
