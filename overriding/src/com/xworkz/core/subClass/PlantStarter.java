package com.xworkz.core.subClass;

import com.xworkz.core.subClass.parentClass.Plant;
import com.xworkz.core.subClass.watchType.PlantType;

public class PlantStarter {

	public static void main(String[] args) {
		
		Plant plant= new Plant("thulasi", true, 0.5f,PlantType.SHORT );
		Plant plant2=new Plant("thulasi", false, 0.5f,PlantType.TALL );
		
		plant.equals(plant2);
		System.out.println(plant.getLifeSpan());
		System.out.println(plant.getType());
		System.out.println(plant2.getType());

	}

}
