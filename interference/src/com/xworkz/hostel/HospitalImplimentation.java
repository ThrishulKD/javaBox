package com.xworkz.hostel;

public class HospitalImplimentation implements HospitalAdmitRule,HospitalDischargeRule{

	@Override
	public boolean paybill() {
		System.out.println("invoked paybill method");
		System.out.println("bill paid");
		return true;
	}

	@Override
	public boolean discount() {
		System.out.println("invoked discount method");
		System.out.println("dicount offered");
		return true;
	}

	@Override
	public String register() {
		System.out.println("patient registered");
		return "registerd";
	}

	@Override
	public double payAdvance() {
		System.out.println("invoked payAdvance method");
		return 10000;
	}

	@Override
	public boolean validInsurance() {
		System.out.println("invoked validInsurance method");
		return false;
	}

}
