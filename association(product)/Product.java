class Product{
	
	String name;
	String type;
	float price;
	String vendor;
	int quantity=51;
	static float totalPriceCost;
	int flag=0;
	
	Product(String name,String type,float price,String vendor){
		
		
		this.name=name;
		this.type=type;
		this.price=price;
	this.vendor=vendor;}
	
	void getDetails1(){
		
		System.out.println(name);
		System.out.println(type);
		System.out.println(price);
		System.out.println(vendor);
		System.out.println(quantity);
		flag=1;
		priceTotalCost();
	}
	
	Product(String name,int quantity,float price){
		
		this.name=name;
		this.quantity=quantity;
		this.price=price;
	}
	void getDetails2(){
		System.out.println(name);
		System.out.println(quantity);
		System.out.println(price);
		flag=0;
		this.priceTotalCost();
		
	}
	
	void priceTotalCost(){
		
	float total= price*quantity;
	totalPriceCost=totalPriceCost+total;
	if (flag==0){
	System.out.println("total cost of 2 differnt quantity:"+totalPriceCost);
	}
	
	}
	
	
	Product (){
		
	}
}