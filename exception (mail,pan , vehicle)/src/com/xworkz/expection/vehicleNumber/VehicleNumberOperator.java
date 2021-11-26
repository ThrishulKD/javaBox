package com.xworkz.expection.vehicleNumber;

import com.xworkz.expection.email.StorageFullRunTimeException;

public class VehicleNumberOperator {
	

		
		private String[] num= new String[5];
		private int count=0;
		
		public void save (String num) throws ValidVehicleRegisterExpection,  StorageFullRunTimeException{
			
		System.out.println("invoked save method");
		if(num!=null && count<num.length()) {
			if(num.contains("@ # $ % ^ & * ( ) _ + =")) {
				System.err.println("invalid vehicle number");
			}
			if(num.contains("KA")) {
				
				this.num[count]=num;
				count++;
				System.out.println("num is Acceptable");
			}
			else {
				System.err.println("enter valid number");
				throw new ValidVehicleRegisterExpection();
			}
		}
		else {
			System.out.println("have to pass numumber");
		throw new StorageFullRunTimeException();
		}

	}

}
