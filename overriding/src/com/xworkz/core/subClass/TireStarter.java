package com.xworkz.core.subClass;

import com.xworkz.core.subClass.parentClass.Tire;

public class TireStarter {

	public static void main(String[] args) {

		Tire tire= new Tire("mrf", 45000f);
		Tire tire2=new Tire("tvs", 4500f);
		
		tire.equals(tire2);
		

	}

}
