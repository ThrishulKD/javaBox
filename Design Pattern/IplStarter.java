package com.xworkz.DP;

import com.xworkz.DP.DAO.IplDAO;
import com.xworkz.DP.DTO.IplDTO;

public class IplStarter {

	public static void main(String[] args) {
		// String name, Integer noOfPlayer, Integer teamSize, String ownername, String
		// sponsership

		IplDTO ref1 = new IplDTO("RCB", 11, 24, "UB", "puma");
		IplDTO ref2 = new IplDTO("MI", 11, 24, "JIO", "JIO");
		IplDTO ref3 = new IplDTO("DD", 11, 24, "UB", "PARAGON");

		IplDAO val = new IplDAO();
		val.create(ref3);
	
		
		
		val.create(new IplDTO("srh", 11, 24, "britania", "puma"), 4);

		val.occupiedIndex();
		val.search("srh");
		
		IplDTO[] array =val.getDetails();
		
		for (int i = 0; i < array.length; i++) {
			IplDTO arr=array[i];
			System.out.println("``````````````````````````````````````````````");
			if(arr!=null) {
			System.out.println("name" +arr.getName());
			System.out.println("numberof player ".concat(String.valueOf(arr.getNoOfPlayer())));
			System.out.println("Team size "+ arr.getTeamSize());
			System.out.println("Sponsership "+ arr.getSponsership());
			System.out.println("ower name "+ arr.getOwnerName());
			
			}
			else {
				System.out.println("null");
			}
		}
	}

}
