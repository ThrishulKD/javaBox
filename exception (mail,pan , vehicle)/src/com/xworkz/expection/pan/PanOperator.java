package com.xworkz.expection.pan;

import com.xworkz.expection.email.StorageFullRunTimeException;

public class PanOperator {
	
	private String[] pan= new String[5];
	private int count=0;
	
	public void save (String pan) throws ValidPanException,  StorageFullRunTimeException{
		
	System.out.println("invoked save method");
	if(pan!=null && count<pan.length()) {
		if(pan.contains("@ # $ % ^ & * ( ) _ + =")) {
			System.err.println("invalid");
		}
		if(pan.contains("G")&& pan.contains("1")) {
			
			this.pan[count]=pan;
			count++;
			System.out.println("pan is Acceptable");
		}
		else {
			System.err.println("enter valid pan id");
			throw new ValidPanException();
		}
	}
	else {
		System.out.println("have to pass email id");
	throw new StorageFullRunTimeException();
	}

}

}
