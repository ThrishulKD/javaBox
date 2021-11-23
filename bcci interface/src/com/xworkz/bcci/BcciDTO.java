package com.xworkz.bcci;

public class BcciDTO {

	private String presidentName;
	private int noOfStatium;
	private float netWorth;


	public BcciDTO(String presidentName, int noOfStatium, float netWorth) {
		super();
		this.presidentName = presidentName;
		this.noOfStatium = noOfStatium;
		this.netWorth = netWorth;
	}

	public String getPresidentName() {
		return presidentName;
	}

	public void setPresidentName(String presidentName) {
		this.presidentName = presidentName;
	}

	public int getNoOfStatium() {
		return noOfStatium;
	}

	public void setNoOfStatium(int noOfStatium) {
		this.noOfStatium = noOfStatium;
	}

	public float getNetWorth() {
		return netWorth;
	}

	public void setNetWorth(float netWorth) {
		this.netWorth = netWorth;
	}

}
