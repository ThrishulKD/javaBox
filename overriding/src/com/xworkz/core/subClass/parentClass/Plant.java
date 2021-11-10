package com.xworkz.core.subClass.parentClass;

import com.xworkz.core.subClass.watchType.PlantType;

public class Plant {
	
	private String name;
	private boolean alive;
	private Float lifeSpan;
	private PlantType type;
	public Plant(String name, boolean alive, Float lifeSpan, PlantType type) {
		super();
		this.name = name;
		this.alive = alive;
		this.lifeSpan = lifeSpan;
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isAlive() {
		return alive;
	}
	public void setAlive(boolean alive) {
		this.alive = alive;
	}
	public Float getLifeSpan() {
		return lifeSpan;
	}
	public void setLifeSpan(Float lifeSpan) {
		this.lifeSpan = lifeSpan;
	}
	public PlantType getType() {
		return type;
	}
	public void setType(PlantType type) {
		this.type = type;
	}
	
	
	@Override
	public boolean equals(java.lang.Object obj) {
	System.out.println("invoked Equals method");
	
	if(obj!=null) {
		if(obj instanceof Plant) {
			Plant plant= (Plant)obj;
			String name=plant.getName();
			Float lifeSpan=plant.getLifeSpan();
			if(name.equals(getName())&&lifeSpan.equals(getLifeSpan())) {
				System.out.println("both matches success");
				return true;
			}
			else {
				System.out.println("miss matches");
			}
		}
		else {
			System.out.println("obj is not instance of plant");
		}
	}
	System.out.println("obj is null");
		return super.equals(obj);
	}

}
