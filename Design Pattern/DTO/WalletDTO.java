package com.xworkz.DP.DTO;

public class WalletDTO {
	private String CompanyName;
	private String material;
	private int totalCompartment;
	private float price;
	private boolean coinCompartment;
	
	public WalletDTO() {
System.out.println("invoked no argument constructor");
	}

	public WalletDTO(String companyName, String material, int totalCompartment, float price, boolean coinCompartment) {
		super();
		CompanyName = companyName;
		this.material = material;
		this.totalCompartment = totalCompartment;
		this.price = price;
		this.coinCompartment = coinCompartment;
	}

	public String getCompanyName() {
		return CompanyName;
	}

	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public int getTotalCompartment() {
		return totalCompartment;
	}

	public void setTotalCompartment(int totalCompartment) {
		this.totalCompartment = totalCompartment;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public boolean isCoinCompartment() {
		return coinCompartment;
	}

	public void setCoinCompartment(boolean coinCompartment) {
		this.coinCompartment = coinCompartment;
	}
	

}
