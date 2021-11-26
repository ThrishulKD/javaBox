package com.xworkz.expection.email;

import java.nio.channels.AlreadyBoundException;

public class EmailOperartor {
	
	private String[] email= new String[5];
	private int count=0;
	
	public void save (String email) throws EmailValidationException,  StorageFullRunTimeException{
		
	System.out.println("invoked save method");
	if(email!=null && count<email.length()) {
		if(email.contains("@")&& email.endsWith(".com") || email.endsWith(".in")) {
			
			this.email[count]=email;
			count++;
			System.out.println("email is Acceptable");
		}
		else {
			System.err.println("enter valid email id");
			throw new EmailValidationException();
		}
	}
	else {
		System.out.println("have to pass email id");
	throw new StorageFullRunTimeException();
	}

}
}
