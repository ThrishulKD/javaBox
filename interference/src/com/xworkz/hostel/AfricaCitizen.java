package com.xworkz.hostel;

public class AfricaCitizen  implements VotingRule,MarriageRule,TrafficRule{
	
	@Override
	public boolean validAge(char gender, int age) {
		
		if(gender=='w'&& age==18) {
		System.out.println("invoked valid age method");
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
		return 18;
	}

	@Override
	public String validId() {
		System.out.println("invoked validID method");
		return "Aadhar card";
	}

	@Override
	public boolean validLicence() {
		System.out.println("invoked validlicence method");
		return true;
	}

	@Override
	public String licenseNo() {
		System.out.println("invoked License number method");
		return "78e45de";
	}

	@Override
	public boolean validInsurance() {
		System.out.println("invoked valid insurance method");
		return true;
	}
	
	private String name;
	private Address adress;
	public void displayNameAndAddressDetails() {
		
		name="vikramabenasamadityaravithejakiranabhaskara";
		Address ref=adress.RAJAJINAGAR;
		System.out.println(name);
		System.out.println(ref);
		
	}
	

	

}
