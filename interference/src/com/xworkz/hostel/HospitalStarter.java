package com.xworkz.hostel;

public class HospitalStarter {

	public static void main(String[] args) {

		HospitalAdmitRule hospitalAdmitRule= new HospitalImplimentation();
		HospitalDischargeRule hospitalDischargeRule= new  HospitalImplimentation();
		
		AdmitandDischargeRule admitandDischargeRule= new AdmitandDischargeRule("Pranesh", "Bangalore", hospitalDischargeRule, hospitalAdmitRule);
		
		admitandDischargeRule.patientInAndOut();

	}

}
