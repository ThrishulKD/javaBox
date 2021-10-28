package com.xworkz.java;

public class NaturalSaloon extends Saloon {
	
	 String name;
	 int noOfAjamas;
	 
	public NaturalSaloon() {
	//super();
		this("mama");
	System.out.println("invoked no argument constructor3");
	}
	
	
	public NaturalSaloon(String name) {
		this.name=name;
		System.out.println("invoked paramweterised constructor2");
	}
	

}
