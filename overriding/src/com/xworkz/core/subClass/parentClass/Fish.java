package com.xworkz.core.subClass.parentClass;

import com.xworkz.core.subClass.watchType.FishType;

public class Fish {
	private String name;
	private FishType type;
	private Float price;
	private String colour;

	public Fish(String name, String colour) {
		super();
		this.name = name;
		this.colour = colour;
		System.out.println("invoked String and String constructor");

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public FishType getType() {
		return type;
	}

	public void setType(FishType type) {
		this.type = type;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	@Override
	public String toString() {
		System.out.println("invoked toSTring method");
		return "meenu";
	}

	@Override
	public int hashCode() {
		System.out.println("invoked hascode method");
		return super.hashCode();

	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	@Override
	public boolean equals(java.lang.Object obj) {
		System.out.println("invoked Equals method");

		if (obj != null) {
			if (obj instanceof Fish) {
				Fish fish = (Fish) obj;
				String name = fish.getName();
				String colour = fish.getColour();
				if (name.equals(getName()) && colour.equals(getColour())) {
					System.out.println("both matches success");
					return true;
				} else {
					System.out.println("miss matches");
				}
			} else {
				System.out.println("obj is not instance of  Fish");
			}
		}
		System.out.println("obj is null");
		return super.equals(obj);
	}

}
