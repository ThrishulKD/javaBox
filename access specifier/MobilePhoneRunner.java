//package com.xworkz;

//import com.xworkz.programm.mobile.Headphone;
public class MobilePhoneRunner {
	
	

	public static void main(String[] args) {
	
		MobilePhone ref=new MobilePhone("one plus");
		
		ref.cost=30000;
		
		System.out.println(ref.name);
		System.out.println(ref.cost);
		
		Headphone ref1=new Headphone("BOAT");
		
		ref1.cost=2500;
		System.out.println(ref1.brand);
		System.out.println(ref1.cost);
		
		
		
			
	}

}
