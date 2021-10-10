class Contractor{
	
	private String name="pramod";
	private float salary=40000;
	private String country="India";
	private String company="LNT";
	private String contruction="metro";
	
	String getName(){
		return this.name;
	}
	String getConstruction(){
		return this.contruction;
	}
	float getSalary(){
		return this.salary;
	}
	String getCountry(){
		return this.country;
		
	}
	String getCompany(){
		return this.company;
	}
	
	void setName(){
		this.name=name;
	}
	void setConstruction(){
		this.contruction=contruction;
	}
	void setSalary(){
		this.salary=salary;
		
	}
	void setCountry(){
		this.country=country;
	}
	void setCompany(){
		this.company=company;
	}
}