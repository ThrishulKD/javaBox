package com.xworkz.core.subClass.parentClass;

public class Tire {
	
	private String brand;
	private Float price;
	public Tire(String brand, Float price) {
		
		super();
		this.brand = brand;
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	
	@Override
	public boolean equals(java.lang.Object obj) {

		System.out.println("invoked equals method");
		
		if(obj!=null) {
		
			if(obj instanceof Tire) {
				Tire tire= (Tire)obj;
				String brand=tire.getBrand();
				Float price= tire.getPrice();
				
				if(brand.equals(getBrand())&&price.equals(getPrice())) {
					System.out.println(" both matches");
					return true;
				}
				else {
					System.out.println("any one doesnt match or both doesnt match");
				}
		}
		else {
			System.err.println("the object is not a instance of Tire");
		}
		}
		else {
			System.err.println("object u r passing is null");
		}
		return false;

}
	

}
