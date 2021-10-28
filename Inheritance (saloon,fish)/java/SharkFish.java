package com.xworkz.java;

public class SharkFish extends Fish {

	float length;
	float weight;

	public SharkFish() {
		System.out.println("invoked no argument Sharkfish constructor");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}

	public SharkFish(float length, float weight) {
		this.length = length;
		this.weight = weight;
		System.out.println("Sharkfish length in meter :" + length);
		System.out.println("Sharkfish weight in kg :" + weight);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}

}
