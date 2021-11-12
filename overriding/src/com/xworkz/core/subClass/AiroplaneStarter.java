package com.xworkz.core.subClass;

import com.xworkz.core.subClass.parentClass.Airoplane;

public class AiroplaneStarter {

	public static void main(String[] args) {
		
		Airoplane airoplane= new Airoplane("Air India", "India");
		Airoplane airoplane2=new Airoplane("Air India", "India");
		airoplane.equals(airoplane2);

	}

}
