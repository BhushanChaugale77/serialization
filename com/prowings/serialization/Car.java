package com.prowings.serialization;

import java.io.Serializable;

public class Car implements Serializable {
	
	private String companyName;
	private int makeyear;
	private Engine engine;
	
	public Car() {
		super();
 	}

	public Car(String companyName, int makeyear, Engine engine) {
		super();
		this.companyName = companyName;
		this.makeyear = makeyear;
		this.engine = engine;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public int getMakeyear() {
		return makeyear;
	}

	public void setMakeyear(int makeyear) {
		this.makeyear = makeyear;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Car [companyName=" + companyName + ", makeyear=" + makeyear + ", engine=" + engine + "]";
	}
	
	
	

}
