package com.xworkz.java.bird;

public class BusRouteRunner {

	public static void main(String[] args) {
		
		BusRouteDTO ref1 = new BusRouteDTO("pancard", "btm", "silk board", "shankerranna");
		BusRouteDTO ref11 = new BusRouteDTO("voter id", "kalasipalya", null, "ravi");
		BusRouteDAO ref2= new BusRouteImplimentation();
		BusAssociation ref3= new BusAssociation(ref2);
		ref3.save(ref1);
		ref3.findDriverName("shankerranna");
		ref3.delete("btm");
		ref3.display();
		ref3.save(ref11);
		ref3.findDriverName("sad");
		ref3.delete("kalasipalya");
		ref3.display();
	}

}
