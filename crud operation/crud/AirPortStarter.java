package com.xworkz.crud;

import com.xworkz.crud.crudOperation.AirPort;

public class AirPortStarter {

	public static void main(String[] args) {

		AirPort ref = new AirPort();

		ref.getAirPortNames();

		ref.addAirPortNames("bangalore");
		ref.addAirPortNames("delhi");
		ref.addAirPortNames("kochi");
		ref.addAirPortNames("hydrabad");
		ref.addAirPortNames("mumbai");
		
		String[] array=ref.getAirPortNames();
		for (int i = 0; i < array.length; i++) {
			
			System.out.println(array[i]);
			
		}

		ref.delete(0);
		ref.update(3, "chennai");
		
		String[] arr=ref.getAirPortNames();
		for (int i = 0; i < arr.length; i++) {
			
			System.out.println(arr[i]);
		}
	}
}



