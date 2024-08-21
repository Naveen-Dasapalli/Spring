package com.springcore.SpEL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("e")
public class Example {

	@Value("#{22+11}")
	private int x;
	
	@Value("#{8>6? 8:6}")
	private int y;
	
	@Value("#{ T(java.lang.Math).sqrt(36) }")
	private double z;
	
	@Value("#{ T(java.lang.Math).E }")
	private double E;
	
	@Value("#{ T(java.lang.Math).PI }")
	private double Pi;

	@Value("#{ new String('Naveen') }")
	private String name;
	
	@Value("#{ 6>9 }")
	private boolean isActive;
	
	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public double getZ() {
		return z;
	}

	@Override
	public String toString() {
		return "Example [x=" + x + ", y=" + y + ", z=" + z + ", E=" + E + ", Pi=" + Pi + ", name=" + name
				+ ", isActive=" + isActive + "]";
	}

	public double getE() {
		return E;
	}

	public void setE(double e) {
		E = e;
	}

	public double getPi() {
		return Pi;
	}

	public void setPi(double pi) {
		Pi = pi;
	}

	public void setZ(double z) {
		this.z = z;
	}
	
}
