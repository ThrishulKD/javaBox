package com.xworkz.police.crimePolice;

import com.xworkz.police.Police;

public class CrimePolice extends Police {
	
	protected int noOfArrest;
	
	public CrimePolice(int noofArrest) {
		super("dayananda");
		this.noOfArrest=noOfArrest;

		System.out.println("invoked no argument constructor of crime police");
	}
	
	public void getpolicename() {
		
		System.out.println("name is :"+super.name);
		System.out.println("no of arrest :"+this.noOfArrest);
		
	}
	
	

}
