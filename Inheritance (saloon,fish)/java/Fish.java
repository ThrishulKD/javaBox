package com.xworkz.java;

public class Fish {

	String region;
	boolean alive;

	Fish() {
		System.out.println("invoked no arguent constructor of Fish");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}

	Fish(String region, boolean alive) {
		this.region = region;
		this.alive = alive;
		System.out.println("fish region :" + region);
		System.out.println("is fish alive or not: " + alive);
	}

}
