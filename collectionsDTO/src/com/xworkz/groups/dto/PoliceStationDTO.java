package com.xworkz.groups.dto;

public class PoliceStationDTO {

	private String name, location, type;
	private int noOfStaffs;

	public PoliceStationDTO(String name, String location, String type, int noOfStaffs) {
		super();
		this.name = name;
		this.location = location;
		this.type = type;
		this.noOfStaffs = noOfStaffs;
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

	@Override
	public String toString() {
		return "PoliceStationDTO [name=" + name + ", location=" + location + ", type=" + type + ", noOfStaffs="
				+ noOfStaffs + "]";
	}

	public int getNoOfStaffs() {
		return noOfStaffs;
	}

	public void setNoOfStaffs(int noOfStaffs) {
		this.noOfStaffs = noOfStaffs;
	}

	@Override
	public int hashCode() {

		return 7;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {

			if (obj instanceof PoliceStationDTO) {
				PoliceStationDTO ref = (PoliceStationDTO) obj;

				String val = ref.getName();
				String val1 = ref.getLocation();
				if (name.equals(val) && location.equals(val1)) {
					return true;
				}
			}
		}

		return false;
	}

}
