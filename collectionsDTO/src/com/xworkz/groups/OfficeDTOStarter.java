package com.xworkz.groups;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;
import com.xworkz.groups.dto.OfficeDTO;

public class OfficeDTOStarter {

	public static void main(String[] args) {

		
		OfficeDTO ref1 = new OfficeDTO("LTI", 4665116, "pune");
		OfficeDTO ref2 = new OfficeDTO("cognizant", 11166, "bangalore");
		OfficeDTO ref3 = new OfficeDTO("TCS", 4466, "bangalore");
		
		Set<OfficeDTO> val= new HashSet<OfficeDTO>();
		val.add(ref3);
		val.add(ref2);
		val.add(ref1);
		val.add(null);
		System.out.println(val.size());
		
		Iterator<OfficeDTO> store= val.iterator();
		while(store.hasNext()) {
		System.out.println(store.next());
		
		}

	}

}
