package com.xworkz.core;

import com.xworkz.java.Ocean;
import com.xworkz.java.Sea;

public class OceanStarter {

	public static void main(String[] args) {

		Ocean pond = new Pond();

		if (pond instanceof Pond) {

			Pond ref = (Pond) pond;

			System.out.println("pond State :"+ ref.state);
			String famousFor=ref.famousFor="Rama Setu";
			System.out.println(" Ocean name :" +ref.name);
			System.out.println("Famous for :" +famousFor);
			
			ref.displayPond();
		}
		
		Sea sea=new Sea("maditerrian Sea",646);
		System.out.println(sea.getName());
		sea.setNoOfIsland(100);
		System.out.println(sea.getNoOfIsland());
		
		
		

	}

}
