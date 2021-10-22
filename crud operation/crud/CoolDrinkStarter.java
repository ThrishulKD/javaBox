package com.xworkz.crud;

import com.xworkz.crud.crudOperation.CoolDrink;

public class CoolDrinkStarter {

	public static void main(String[] args) {

		CoolDrink ref = new CoolDrink();
		ref.getBrandNames();
		

		ref.addBrandNames("fanta");
		ref.addBrandNames("sting");
		ref.addBrandNames("redBull");
		ref.addBrandNames("7 up");
		ref.addBrandNames("maaza");

		String[] array = ref.getBrandNames();
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

		ref.delete(2);
		ref.update(1, "slice");

		String[] arr = ref.getBrandNames();
		for (int i = 0; i < arr.length; i++) {

			System.out.println(arr[i]);
		}

	}

}
