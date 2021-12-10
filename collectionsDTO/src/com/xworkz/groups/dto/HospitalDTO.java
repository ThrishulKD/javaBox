package com.xworkz.groups.dto;

public class HospitalDTO {
	
	private String name, location,type;
	private int noOfAmbulance;
	public HospitalDTO(String name, String location, String type, int noOfAmbulance) {
		super();
		this.name = name;
		this.location = location;
		this.type = type;
		this.noOfAmbulance = noOfAmbulance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getNoOfAmbulance() {
		return noOfAmbulance;
	}
	public void setNoOfAmbulance(int noOfAmbulance) {
		this.noOfAmbulance = noOfAmbulance;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 55;
		
	}
	
	@Override
	public boolean equals(Object obj) {


		if(obj!=null) {
			
			if(obj instanceof HospitalDTO) {
				HospitalDTO ref= (HospitalDTO)obj;
			
				if(name.equals(ref.getName())&&location.equals(ref.getLocation())) {
					return true;
				}
			}
		}
		
		return false;
	

}
	@Override
	public String toString() {
		return "HospitalDTO [name=" + name + ", location=" + location + ", type=" + type + ", noOfAmbulance="
				+ noOfAmbulance + "]";
	}
	
}
