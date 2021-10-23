package com.xworkz.DP.DTO;

public class BusDriverDTO {

	private String name;
	private float height;
	private float drivigDistance;

	public BusDriverDTO() {
		System.out.println("invoked no argument constructor");
	}

	public BusDriverDTO(String name, float height, float drivigDistance) {
		super();
		this.name = name;
		this.height = height;
		this.drivigDistance = drivigDistance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getDrivigDistance() {
		return drivigDistance;
	}

	public void setDrivigDistance(float drivigDistance) {
		this.drivigDistance = drivigDistance;
	}

}
