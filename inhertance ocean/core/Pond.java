package com.xworkz.core;

import com.xworkz.java.Ocean;

public class Pond extends Ocean {
	
	String state="Tamil Nadu";
	
	public Pond() {
		
		System.out.println("invoked pond no arg constructor");
	}
	
	
		void displayPond() {
			
			System.out.println(state);
			System.out.println(super.famousFor);
			String name=super.name;
			System.out.println(name);
			
			
			
		}

}
