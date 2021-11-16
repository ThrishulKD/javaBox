package com.xworkz.hostel;

public class IndianCitizenStarter {

	public static void main(String[] args) {

		IndianCitizen indianCitizen= new IndianCitizen();
		System.out.println(indianCitizen.validId());
		indianCitizen.displayNameAndAddressDetails();
		System.out.println(indianCitizen.validInsurance());
		System.out.println(indianCitizen.validAge('m', 21));
		System.out.println(indianCitizen.licenseNo());
		System.out.println(indianCitizen.validLicence());
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		Object object= new IndianCitizen();
		VotingRule votingRule= new IndianCitizen();
		MarriageRule marriageRule= new IndianCitizen();
		TrafficRule trafficRule= new IndianCitizen();
		
		AfricaCitizen africaCitizen= new AfricaCitizen();
		
		Object object1= new AfricaCitizen();
		VotingRule votingRule2= new AfricaCitizen();
		MarriageRule marriageRule3= new AfricaCitizen();
		TrafficRule trafficRule4= new AfricaCitizen();
		
		System.out.println(africaCitizen.validId());
		africaCitizen.displayNameAndAddressDetails();
		System.out.println(africaCitizen.validInsurance());
		System.out.println(africaCitizen.validAge('m', 21));
		System.out.println(africaCitizen.licenseNo());
		System.out.println(africaCitizen.validLicence());
		

	}

}
