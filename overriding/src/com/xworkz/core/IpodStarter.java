package com.xworkz.core;

import com.xworkz.core.subClass.Ipod;

public class IpodStarter {

	public static void main(String[] args) {

		Ipod ipod= new Ipod();
		System.out.println(ipod.toString());
		System.out.println(ipod.hashCode());
		Ipod ipod2= new Ipod();
		
		ipod.setModelNo(4646);
		ipod2.setModelNo(4646);
		System.out.println(ipod.equals(ipod2));
	}
	

}
