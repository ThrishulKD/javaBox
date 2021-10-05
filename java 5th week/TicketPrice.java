enum TicketPrice{
	
	GANDHI(30,0.0f),MIDDLE(50,0.5F),BALCONY(100,1.0F),BOX(150,2.0F);
	
	int price;
	float tax;
	
	TicketPrice(int price, float tax){
		
		this.price=price;
		this.tax=tax;
	}
}