package com.xworkz.groups;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.xworkz.groups.dto.HospitalDTO;

public class HospitalStarter {

	public static void main(String[] args) {


		HospitalDTO ref1= new HospitalDTO("jaydeva", "btm", "heart", 23);
		HospitalDTO ref2= new HospitalDTO("gayathri", "napoklu", "fullstact", 5);
		HospitalDTO ref3= new HospitalDTO("jaydeva", "btm", "heart", 23);
		
		
		Set<HospitalDTO> val= new HashSet<HospitalDTO>();
		
		val.add(ref3);
		val.add(ref2);
		val.add(ref1);	
		
		System.out.println(val.size());
	
	Iterator<HospitalDTO> any= val.iterator();
	while(any.hasNext()) {
	System.out.println(any.next());
	
	}
	}

}
