package com.xworkz.core.subClass.parentClass;

public class City {
	
	private String name;
	private String State;
	private String country;
	
	public City(String name, String state) {
		super();
		this.name = name;
		State = state;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	

	@Override
	public boolean equals(java.lang.Object obj) {

		System.out.println("invoked equals method");
		
		if(obj!=null) {
		
			if(obj instanceof City) {
				City city= (City)obj;
				String name=city.getName();
				String state=city.getState();
				
				if(state.equals(getState())&&name.equals(getName())) {
					System.out.println(" both matches");
					return true;
				}
				else {
					System.out.println("any one doesnt match or both doesnt match");
				}
		}
		else {
			System.err.println("the object is not a instance of city");
		}
		}
		else {
			System.err.println("object u r passing is null");
		}
		return false;

}
	
	
	

}
