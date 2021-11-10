package com.xworkz.core.subClass;

import com.xworkz.core.subClass.Type.BagColour;
import com.xworkz.core.subClass.parentClass.Bag;

public class BagStarter {

	public static void main(String[] args) {
		
		Bag bag=new Bag(464f, BagColour.BLACK);
		Bag bag2=new Bag(464f, BagColour.BLACK);
		
		bag.equals(bag2);
		System.out.println(bag2.getSections());

	}

}
