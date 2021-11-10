package com.xworkz.core.subClass.parentClass;

public class Shoe {
	private String brand="nick";
	private int size=8;
	private String colour;
	private String gender;

	public Shoe(String colour, String gender) {
		super();
		this.colour = colour;
		this.gender = gender;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public boolean equals(java.lang.Object obj) {
		System.out.println("invoked Equals method");

		if (obj != null) {
			if (obj instanceof Shoe) {
				Shoe shoe = (Shoe) obj;
				String colour = shoe.getColour();
				String gender = shoe.getGender();
				if (colour.equals(getColour()) && gender.equals(getGender())) {
					System.out.println("both matches success");
					return true;
				} else {
					System.out.println("miss matches");
				}
			} else {
				System.out.println("obj is not instance of  Shoe");
			}
		}
		System.out.println("obj is null");
		return super.equals(obj);
	}
}
