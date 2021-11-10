package com.xworkz.core.subClass;

import com.xworkz.core.subClass.parentClass.Shoe;

public class ShoeStarter {

	public static void main(String[] args) {

		Shoe shoe= new Shoe("black", "male");
		Object shObject=new Shoe("pink", "female");
		shoe.equals(shObject);
		System.out.println(shoe.getBrand());
		System.out.println(shoe.getSize());
		

	}

}
