class FoodItem{
	String name;
	float price;
	String hotelName="Annapoorna";
	int quantity;
	Type type;
	float ratings;
	OrderType orderType;
	static float printtotalFoodItemPrice;
	
	
	FoodItem(String name,float price,int quantity,Type type,OrderType orderType){
		
		this.name=name;
		this.price=price;
		this.quantity=quantity;
		this.type=type;
		this.orderType=orderType;
	}
	
	void getDetails(){
		System.out.println(this.name);
		System.out.println(hotelName);
		System.out.println(this.price);
		System.out.println(this.quantity);
		System.out.println(this.type);
		System.out.println(orderType);
		System.out.println(ratings);
		this.printtotalprice();
	}
	void printtotalprice(){
		
		float total = price*quantity;
		System.out.println("total bill :"+total);
		printtotalFoodItemPrice=printtotalFoodItemPrice+total;
		System.out.println("Total Amount gained by the hotel : "+printtotalFoodItemPrice);
	}

	
	
}