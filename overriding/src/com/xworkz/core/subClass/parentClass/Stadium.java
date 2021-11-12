package com.xworkz.core.subClass.parentClass;

public class Stadium {
	private String name;
	private String area;
	private float areaInArea;
	public Stadium(String name, String area) {
		super();
		this.name = name;
		this.area = area;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public float getAreaInArea() {
		return areaInArea;
	}
	public void setAreaInArea(float areaInArea) {
		this.areaInArea = areaInArea;
	}
	
	
	@Override
	public boolean equals(java.lang.Object obj) {

		System.out.println("invoked equals method");
		
		if(obj!=null) {
		
			if(obj instanceof Stadium) {
				Stadium stadium= (Stadium)obj;
				String name=stadium.getName();
				Float area=stadium.getAreaInArea();
				
				if(area.equals(getAreaInArea())&&name.equals(name)) {
					System.out.println(" both matches");
					return true;
				}
				else {
					System.out.println("any one doesnt match or both doesnt match");
				}
		}
		else {
			System.err.println("the object is not a instance of Stadium");
		}
		}
		else {
			System.err.println("object u r passing is null");
		}
		return false;

}
	

}
