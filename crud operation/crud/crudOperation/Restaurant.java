package com.xworkz.crud.crudOperation;

public class Restaurant {

	private String name;
	private String[] location = new String[5];
	private int count = 0;

	public Restaurant() {
		this("sasayahari");
	}

	public Restaurant(String name) {

		this.name = name;
		System.out.println("invoked parameterized constructor");

	}

	public String getRestaurantName() {
		return this.name;

	}

	public void addRestaurantLocation(String name) {

		if (count < 5) {
			location[count] = name;
			count++;
		} else {

			System.out.println("array size jasthi aithu");
		}
	}

	public void displayDetails() {
		for (int i = 0; i < location.length; i++) {

			System.out.println("Restaurent name is ".concat(location[i]));
		}

	}
}
