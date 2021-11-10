package com.xworkz.core.subClass;

import com.xworkz.core.subClass.parentClass.Fish;

public class FishStarter {
	
	public static void main(String[] args) {
		 Fish fish =new Fish("Shark", "blue");
		 Fish fish2=new Fish("Shark", "blue");	
		 
		 fish.equals(fish2);
		 
		 System.out.println(fish.getType().AYLE);
		 System.out.println(fish.hashCode());
		 System.out.println(fish.toString());
	}
	
	

}
