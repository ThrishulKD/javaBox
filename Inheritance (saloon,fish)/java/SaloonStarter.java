package com.xworkz.java;

public class SaloonStarter {

	public static void main(String[] args) {
		
		NaturalSaloon ref1= new NaturalSaloon();
		System.out.println(ref1.name);
		
		Saloon saloon=new NaturalSaloon();
		Saloon val=new Saloon(20);
		System.out.println("name: "+ref1.name);
		
		
		//NaturalSaloon ref2=new NaturalSaloon();
		
		//System.out.println(ref1.name);
		

	}

}
