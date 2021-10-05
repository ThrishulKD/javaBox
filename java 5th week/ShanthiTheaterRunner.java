class ShanthiTheaterRunner{
	
	public static void main(String[] arg){
		
		Theater theater= new Theater("Mysore","shanthi",TicketPrice.BOX);
		
		System.out.println(theater);
		System.out.println(theater.name);
		System.out.println(theater.location);
		System.out.println(theater.capacity);
		System.out.println(theater.ticketPrice.price);

		
	}
}