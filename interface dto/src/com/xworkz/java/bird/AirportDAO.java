package com.xworkz.java.bird;

public interface AirportDAO {

	boolean saveDetails(AirportDTO dto);

	AirportDTO findName(String name);

	public void display();

}
