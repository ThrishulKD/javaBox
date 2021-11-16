package com.xworkz.hostel;

public class IndianCitizen implements VotingRule,MarriageRule,TrafficRule {

	@Override
	public boolean validAge(char gender, int age) {
		
		if(gender=='m'&& age==21) {
		System.out.println("invoked valid age method");
		System.out.println("valid age");
		return true;
		}
		else {
			System.out.println("invalid age and gender");
		}
		return false;
	}


	@Override
	public int validAge() {
		System.out.println("invoked validAge method");
		return 21;
	}

	@Override
	public String validId() {
		System.out.println("invoked validID method");
		return "voterid";
	}

	@Override
	public boolean validLicence() {
		System.out.println("invoked validlicence method");
		return true;
	}

	@Override
	public String licenseNo() {
		System.out.println("invoked License number method");
		return "544dw5";
	}

	@Override
	public boolean validInsurance() {
		System.out.println("invoked valid insurance method");
		return false;
	}
	
	private String name;
	private Address adress;
	public void displayNameAndAddressDetails() {
		
		name="Thrishul";
		Address ref=adress.HOSAROAD;
		System.out.println(name);
		System.out.println(ref);
		
	}
	

	
}
