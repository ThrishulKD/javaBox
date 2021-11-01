package com.xworkz.police;

public class Police {
	protected String name;
	public String designation="constable";

	public Police(String name) {

		this.name = name;

		System.out.println("police name :" + name);
	}

	public Police() {
		System.out.println("invoked no argument constructor");
	}
	public Police(int arrest) {
		System.out.println(arrest);
		
	}
}
