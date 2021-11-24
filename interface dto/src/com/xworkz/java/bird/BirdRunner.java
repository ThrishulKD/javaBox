package com.xworkz.java.bird;

public class BirdRunner {
	
	public static void main(String[] args) {
		
		BirdDTO ref1= new BirdDTO("AadharCard", "tisen", 1, "mysore", true);
		BirdDTO ref5= new BirdDTO("pan card", "suguna", 2, "btm", false);
		BirdInterface ref2= new BirdImplimentation();
		BirdAssociation ref3 =new BirdAssociation(ref2);
		ref3.saveBird(ref1);
		ref3.saveBird(ref5);
		System.out.println("````````````````````````");
		ref3.getBirdage(ref1);
		System.out.println("````````````````````````");
		ref3.getBirdage(ref5);
		System.out.println("````````````````````````");
		ref3.displayDetails();

	}

}
