package com.xworkz.hostel;

public class AdmitandDischargeRule {

	private String name;
	private String location;
	private HospitalDischargeRule hospitalDischargeRule;
	private HospitalAdmitRule hostAdmitRule;

	public AdmitandDischargeRule(String name, String location, HospitalDischargeRule hospitalDischargeRule,
			HospitalAdmitRule hostAdmitRule) {
		super();
		this.name = name;
		this.location = location;
		this.hospitalDischargeRule = hospitalDischargeRule;
		this.hostAdmitRule = hostAdmitRule;
	}

	public void patientInAndOut() {
		System.out.println("invoked patient In and Out method");

		if (name != null)
			
			

		{
			hostAdmitRule.register();

			if (hostAdmitRule.payAdvance() == 10000d) {

				System.out.println("patient admitted");
				if (hospitalDischargeRule.paybill() == true && hospitalDischargeRule.discount() == true) {
					System.out.println("patient can be discharge : tata hogi baa");
				}
			} else {
				System.out.println("first advance pay maadu");
			}

		} else {
			System.out.println("name is not registered");
		}
	}
}
