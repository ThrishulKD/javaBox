package com.xworkz.expection.vehicleNumber;

import com.xworkz.expection.email.StorageFullRunTimeException;

public class VehicleStarter {
	
	public static void main(String[] args) throws ValidVehicleRegisterExpection, StorageFullRunTimeException {
		
		VehicleNumberOperator num=new VehicleNumberOperator();
		num.save("KA51E64");
		
	}

}
