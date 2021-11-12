package com.xworkz.core.subClass.parentClass;

public class Airoplane {
	
	
	private String company;
	private String government;
	
	
	public Airoplane(String company, String government) {
		super();
		this.company = company;
		this.government = government;
	}


	public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	}


	public String getGovernment() {
		return government;
	}


	public void setGovernment(String government) {
		this.government = government;
	}
	
	@Override
	public boolean equals(java.lang.Object obj) {

		System.out.println("invoked equals method");
		
		if(obj!=null) {
		
			if(obj instanceof Airoplane) {
				Airoplane airoplane= (Airoplane)obj;
				String name=airoplane.getCompany();
				String government= airoplane.getGovernment();
				
				if(name.equals(getCompany())&&government.equals(getGovernment())) {
					System.out.println(" both matches");
					return true;
				}
				else {
					System.out.println("any one doesnt match or both doesnt match");
				}
		}
		else {
			System.err.println("the object is not a instance of Airoplane");
		}
		}
		else {
			System.err.println("object u r passing is null");
		}
		return false;

}
}
