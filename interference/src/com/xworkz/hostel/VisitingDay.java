package com.xworkz.hostel;

public interface VisitingDay extends Hostel {

	String visitingDay();

	@Override
	default int inTime() {

		System.out.println("extended from hostel");
		return 0;
	}

}
