package com.xworkz.PoliceStarter;

import com.xworkz.police.Police;
import com.xworkz.police.TrafficPolice;
import com.xworkz.police.crimePolice.CrimePolice;

public class PoliceStarter {

	public static void main(String[] args) {

		CrimePolice ref1=new CrimePolice(56);
		ref1.getpolicename();
		
		Police ref2=new Police(56);
		String ref3=ref2.designation;
		System.out.println(ref3);
		
		TrafficPolice ref4= new TrafficPolice();
		
		

	}

}
