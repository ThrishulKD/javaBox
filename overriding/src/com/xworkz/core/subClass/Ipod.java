package com.xworkz.core.subClass;

public class Ipod {
	private Integer modelNo;
	private String brand = "apple";

	public int getModelNo() {
		return modelNo;
	}

	public void setModelNo(int modelNo) {
		this.modelNo = modelNo;
	}

	public Ipod() {
		System.out.println("invoked no arg ipod constructor");
	}

	@Override
	public String toString() {

		System.out.println("invoked toString method");
		return brand;

	}

	@Override
	public int hashCode() {
		System.out.println("invoked hashcode method");
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("invoked equals method");

		if (obj != null) {
			if (obj instanceof Ipod) {

				Ipod song = (Ipod) obj;
				System.out.println("ipod casted");
				Integer ref=song.getModelNo();
				
				if(this.modelNo.equals(ref)) {
					System.out.println("matched");	
					return true;
				}
				else {
					System.err.println("missmatch");
				}
			}
		}

		return false;
	}

}
