package com.xworkz.crud.crudOperation;

public class BeachStarter {

	private String country = new String();
	private String[] beachNames = new String[5];
	private int count = 0;

	public BeachStarter() {
		this("INDIA");
		System.out.println("invoked parameterised constructor");
	}

	public BeachStarter(String country) {
		this.country = country;

		System.out.println("invoked no argument constructor");

	}

	public String getCountry() {

		return country;
	}

	public void addBeachNames(String name) {
		System.out.println("beach names : ".concat(name));

		if (this.count < 5) {

			this.beachNames[this.count] = name;
			this.count++;
		} else {

			System.out.println("array is full");
		}
	}

	public void displayBeachNames() {
		System.out.println("invoked display method");

		for (int i = 0; i < beachNames.length; i++) {

			String name = this.beachNames[i];
			System.out.println(name);
		}
	}

}
