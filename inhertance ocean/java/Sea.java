package com.xworkz.java;

public class Sea extends Ocean {

	
	private String name;
	private int noOfIsland;
	
	public Sea(String name,int noOfIsland) {
		super("indian ocean");
		this.name=name;
		this.noOfIsland=noOfIsland;


		System.out.println("invoked sea no argument constructor");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNoOfIsland() {
		return noOfIsland;
	}

	public void setNoOfIsland(int noOfIsland) {
		this.noOfIsland = noOfIsland;
	}
}
