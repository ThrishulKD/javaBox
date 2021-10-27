package com.xworkz.DP.DTO;

public class BucketDTO {
	private String colour;
	private float size;
	private float quantity;
	private float weight;
	private String company;
	
	public BucketDTO() {

		System.out.println("invoked no argument constructor");
		
	}

	public BucketDTO(String colour, float size, float quantity, float weight, String company) {
		super();
		this.colour = colour;
		this.size = size;
		this.quantity = quantity;
		this.weight = weight;
		this.company = company;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public float getSize() {
		return size;
	}

	public void setSize(float size) {
		this.size = size;
	}

	public float getQuantity() {
		return quantity;
	}

	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

}
