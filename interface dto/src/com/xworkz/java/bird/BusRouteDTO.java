package com.xworkz.java.bird;

public class BusRouteDTO {
	
	private String id;
	private String startPoint;
	private String destination;
	private String drivername;

	public BusRouteDTO() {

		System.out.println("no arg constructor");
	}

	public BusRouteDTO(String id, String startPoint, String destination, String drivername) {
		super();
		this.id = id;
		this.startPoint = startPoint;
		this.destination = destination;
		this.drivername = drivername;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getStartPoint() {
		return startPoint;
	}

	public void setStartPoint(String startPoint) {
		this.startPoint = startPoint;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getDrivername() {
		return drivername;
	}

	public void setDrivername(String drivername) {
		this.drivername = drivername;
	}
	
}
