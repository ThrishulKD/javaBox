package com.xworkz.core.subClass.parentClass;

import com.sun.xml.internal.bind.v2.runtime.RuntimeUtil.ToStringAdapter;
import com.xworkz.core.subClass.watchType.WatchType;

public class Watch {
	
	private String brand;
	private WatchType type;
	private Float price;
	
	public Watch(String brand, float price) {
		this.brand=brand;
		this.price=price;
		System.out.println("invoked brand and price constructor");
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public WatchType getType() {
		return type;
	}

	public void setType(WatchType type) {
		this.type = type;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	
	
	@Override
	public String toString() {
		System.out.println("invoked tostring method");
		return "toString";
	}
	
	@Override
	public int hashCode() {
		System.out.println("invoked hashcode method");
		return super.hashCode();
	}
	
	@Override
	public boolean equals(java.lang.Object obj) {

		System.out.println("invoked equals method");
		
		if(obj!=null) {
		
			if(obj instanceof Watch) {
				Watch watch= (Watch)obj;
				String brand=watch.getBrand();
				Float price=watch.getPrice();
				
				if(brand.equals(getBrand())&&price.equals(getPrice())) {
					System.out.println(" both matches");
					return true;
				}
				else {
					System.out.println("any one doesnt match or both doesnt match");
				}
		}
		else {
			System.err.println("the object is not a instance of watch");
		}
		}
		else {
			System.err.println("object u r passing is null");
		}
		return false;

}
}
