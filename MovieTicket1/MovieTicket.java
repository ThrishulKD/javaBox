class MovieTicket{
	
	String movieName;
	String theater="Rajkamal";
	float price;
	int noOfSeats;
	Type type;
	static float totalPrice;
	
	
	MovieTicket(String name,float price,int noOfSeats){
		
		movieName=name;
		this.price=price;
		this.noOfSeats=noOfSeats;
	}
	
	MovieTicket(){
		
	}
	
	void displayDetails(){
		
		System.out.println(theater);
		System.out.println(this.movieName);
		System.out.println(this.price);
		System.out.println(this.noOfSeats);
		System.out.println(type);
		
		this.printTotalPrice();
	}
		
		void printTotalPrice(){
			
			float total=noOfSeats*price;
			System.out.println("Total is equal to :"+total);
			totalPrice=totalPrice+total;
			System.out.println("Total collection to the theater: "+totalPrice);
		}
}