package com.xworkz.DP.DTO;

public class BracletDTO {

	private String material;
	private float price;
	private String color;
	private boolean gifted;
	private boolean gemUsed;

	public BracletDTO() {

		System.out.println("no arg constructor");
	}

	public BracletDTO(String material, float price, String color, boolean gifted, boolean gemUsed) {
		super();
		this.material = material;
		this.price = price;
		this.color = color;
		this.gifted = gifted;
		this.gemUsed = gemUsed;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isGifted() {
		return gifted;
	}

	public void setGifted(boolean gifted) {
		this.gifted = gifted;
	}

	public boolean isGemUsed() {
		return gemUsed;
	}

	public void setGemUsed(boolean gemUsed) {
		this.gemUsed = gemUsed;
	}

}
