class Curtain{
	
	private String colour;
	private float length;
	private float cost;
	private String material;
	private String usedIn;
	
	
	String getColour(){
		return this.colour;
	}
	float getLength(){
		return this.length;
	}
	float getCost(){
		return this.cost;
	}
	
	String getMaterial(){
		return this.material;
	}
	
	String getUsedIn(){
		return this.usedIn;
	}
	
	void setColour(String colour){
		this.colour=colour;
	}
	
	void setLength(float length){
		this.length=length;		
	}
	void setCost(float cost){
	this.cost=cost;}
		void setMaterial(String material){
	this.material=material;}
		void setUsedIn(String usedIn){
	this.usedIn=usedIn;}
}