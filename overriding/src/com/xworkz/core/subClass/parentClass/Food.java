package com.xworkz.core.subClass.parentClass;

public class Food {
	private String name;
	private Float price;
	private Float quantity;
	private String quality;

	public Food(Float quantity, String quality) {
		super();
		this.quantity = quantity;
		this.quality = quality;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Float getQuantity() {
		return quantity;
	}

	public void setQuantity(Float quantity) {
		this.quantity = quantity;
	}

	public String getQuality() {
		return quality;
	}

	public void setQuality(String quality) {
		this.quality = quality;
	}

	@Override
	public boolean equals(java.lang.Object obj) {
		System.out.println("invoked Equals method");

		if (obj != null) {
			if (obj instanceof Food) {
				Food food = (Food) obj;
				Float quantity = food.getQuantity();
				String quality = food.getQuality();
				if (quantity.equals(getQuantity()) && quality.equals(getQuality())) {
					System.out.println("both matches success");
					return true;
				} else {
					System.out.println("miss matches");
				}
			} else {
				System.out.println("obj is not instance of  Food");
			}
		}
		System.out.println("obj is null");
		return super.equals(obj);
	}

}
