package com.xworkz.groups.dto;

public class OfficeDTO {
	
	private String name;
	private int noOfEmployees;
	private String location;
	public OfficeDTO(String name, int noOfEmployees, String location) {
		super();
		this.name = name;
		this.noOfEmployees = noOfEmployees;
		this.location = location;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNoOfEmployees() {
		return noOfEmployees;
	}
	public void setNoOfEmployees(short noOfEmployees) {
		this.noOfEmployees = noOfEmployees;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 56;
	}
	
	@Override
	public boolean equals(Object obj) {


		if(obj!=null) {
			
			if(obj instanceof OfficeDTO) {
				OfficeDTO ref= (OfficeDTO)obj;
			
				if(name.equals(ref.getName())&&location.equals(ref.getLocation())&&noOfEmployees==ref.getNoOfEmployees()) {
					return true;
				}
			}
		}
		
		return false;
		
	}
	@Override
	public String toString() {
		return "OfficeDTO [name=" + name + ", noOfEmployees=" + noOfEmployees + ", location=" + location + "]";
	}
	
	

}
