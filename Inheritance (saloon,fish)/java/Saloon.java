package com.xworkz.java;

public class Saloon {
	 int noOfAjamas;
	 String name;
	
	public Saloon() {
		System.out.println("invoked no Argument constructor1");
	}
	
	public Saloon(int noOfAjamas) {
		this.noOfAjamas=noOfAjamas;
		System.out.println("number of Ajamas: " .concat(String.valueOf(noOfAjamas)));
		
	}

}
