package com.xworkz.hostel;

public class SharavathiHostel implements Hostel, VisitingDay {

	@Override
	public int inTime() {
		System.out.println("invoked intime method");
		return 10;
	}

	@Override
	public String visitingDay() {
		System.out.println("invoked visiting method");
		return "SUNDAY";
	}
}
