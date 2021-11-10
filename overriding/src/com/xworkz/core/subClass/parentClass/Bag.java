package com.xworkz.core.subClass.parentClass;

import com.xworkz.core.subClass.Type.BagColour;

public class Bag {
	private Float price;
	private BagColour colour;
	private Integer sections;
	public Bag(Float price, BagColour colour) {
		super();
		this.price = price;
		this.colour = colour;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public BagColour getColour() {
		return colour;
	}
	public void setColour(BagColour colour) {
		this.colour = colour;
	}
	public Integer getSections() {
		return sections;
	}
	public void setSections(Integer sections) {
		this.sections = sections;
	}
	
	@Override
	public boolean equals(java.lang.Object obj) {
		System.out.println("invoked Equals method");

		if (obj != null) {
			if (obj instanceof Bag) {
				 Bag bag = (Bag) obj;
				Float price = bag.getPrice();
				BagColour colour = bag.getColour();
				if (colour.equals(getColour()) && price.equals(getPrice())) {
					System.out.println("both matches success");
					return true;
				} else {
					System.out.println("miss matches");
				}
			} else {
				System.out.println("obj is not instance of   Bag)");
			}
		}
		System.out.println("obj is null");
		return super.equals(obj);
	}

}
