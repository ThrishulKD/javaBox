package com.xworkz.java;

public class GoldFish extends Fish {

	String colour;
	float size;

	public GoldFish() {
		System.out.println("invoked no argument constructor of goldfish");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}

	public GoldFish(String colour, float size) {
		this.colour = colour;
		this.size = size;
		System.out.println("colour of gold fIsh : " + colour);
		System.out.println("size of gold fish in meter : " + size);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
}
