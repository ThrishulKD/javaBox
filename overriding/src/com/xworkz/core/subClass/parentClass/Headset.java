package com.xworkz.core.subClass.parentClass;

import com.xworkz.core.subClass.watchType.HeadsetType;

public class Headset {
	private String brand;
	private HeadsetType type;
	private boolean battery;
	private Float warrenty;
	
	
	public Headset(String brand, Float warrenty) {
		super();
		this.brand = brand;
		this.warrenty = warrenty;
		System.out.println("invoked  brand and warrenty constructor");
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public HeadsetType getType() {
		return type;
	}
	public void setType(HeadsetType type) {
		this.type = type;
	}
	public boolean isBattery() {
		return battery;
	}
	public void setBattery(boolean battery) {
		this.battery = battery;
	}
	public Float getWarrenty() {
		return warrenty;
	}
	public void setWarrenty(Float warrenty) {
		this.warrenty = warrenty;
	}
	
	
	@Override
	public boolean equals(java.lang.Object obj) {

		System.out.println("invoked equals method");
		
		if(obj!=null) {
		
			if(obj instanceof Headset) {
				Headset headset= (Headset)obj;
				String brand=headset.getBrand();
				Float price=headset.getWarrenty();
				
				if(brand.equals(getBrand())&&price.equals(getWarrenty())) {
					System.out.println(" both matches");
					return true;
				}
				else {
					System.out.println("any one doesnt match or both doesnt match");
				}
		}
		else {
			System.err.println("the object is not a instance of Headset");
		}
		}
		else {
			System.err.println("object u r passing is null");
		}
		return false;

}
	
	
	

}
