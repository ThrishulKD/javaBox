class MovieTicketRunner{
	
	public static void main(String[] args){
		
		MovieTicket ref1=new MovieTicket("Cruella",160f,2);
		ref1.type=Type.VIP;
		ref1.displayDetails();
		
		MovieTicket ref2= new MovieTicket("F&F9",240,2);
		ref2.type=Type.TOPCLASS;
		ref2.displayDetails();
	}
}