package com.xworkz.java.bird;

public interface BusRouteDAO {

	boolean saveDetails(BusRouteDTO dto);

	BusRouteDTO findDriverName(String name);

	BusRouteDTO deleteStartingPoint(String startingPoint);

	public void display();

}
