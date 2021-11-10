package com.xworkz.core.subClass;

import com.xworkz.core.subClass.parentClass.Headset;

public class HeadSetScammer {
	
	public static void main(String[] args) {
		
		Headset headset= new Headset("sony", 1.5f);
		Headset headset2= new Headset("sony", 1f);
		
		headset.equals(headset2);
		System.out.println(headset.getType().MEDIUM);
		System.out.println(headset.getBrand());
		headset.setBattery(true);
		System.out.println(headset.isBattery());
		
	}

}
