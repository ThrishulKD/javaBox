package com.xworkz.crud.crudOperation;

public class WaterFalls {

	private String location;
	private float[] height = new float[5];
	private int count = 0;

	public WaterFalls() {
		this("kodagu");
		System.out.println("location is : " .concat(location));
	}

	public WaterFalls(String location) {

		this.location = location;
		System.out.println("invoked parameterized constructor");

	}

	public String getWaterFallsName() {
		return this.location;

	}

	public void addWaterFallsHeight(float digit) {

		if (count < 5) {
			height[count] = digit;
			count++;
		} else {

			System.out.println("array size jasthi aithu");
		}
	}

	public void displayDetails() {
		for (int i = 0; i < height.length; i++) {

			System.out.println("WaterFalls height in meters is " + (height[i]));
		}

	}
}
