class TheaterRunner{
	
public static void main(String[] val){
		TicketPrice tp= TicketPrice.GANDHI;
		System.out.println(tp.price);
		
		TicketPrice r= TicketPrice.BOX;
		System.out.println(r.price);
		System.out.println(r.tax);
		
		Theater theater= new Theater("Mysore","shanthi",TicketPrice.BOX);
		
		System.out.println(theater.name);
		System.out.println(theater.location);
		System.out.println(theater.capacity);
				System.out.println(theater.ticketPrice.price);
		
		
		
		System.out.println(TicketPrice.BALCONY.price);
}
		
}