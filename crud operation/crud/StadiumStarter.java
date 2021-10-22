package com.xworkz.crud;

import com.xworkz.crud.crudOperation.Stadium;

public class StadiumStarter {

	public static void main(String[] args) {

		Stadium ref = new Stadium();
		ref.getStadiumNames();

		ref.addStadiumNames("chinnaswamy");
		ref.addStadiumNames("chidambaram");
		ref.addStadiumNames("chipak");
		ref.addStadiumNames("wankade");
		ref.addStadiumNames("mohali");

		String[] array = ref.getStadiumNames();
		System.out.println("before delete and update ");

		for (int i = 0; i < array.length; i++) {

			System.out.println(array[i]);
		}

		ref.delete(1);
		ref.update(2, "ferosaha kotla");

		String[] array1 = ref.getStadiumNames();
		System.out.println("After Updation");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array1[i]);
		}
	}

}
