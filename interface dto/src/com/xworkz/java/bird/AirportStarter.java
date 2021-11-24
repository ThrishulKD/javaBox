package com.xworkz.java.bird;

public class AirportStarter {

	public static void main(String[] args) {

		AirportDTO ref1 = new AirportDTO("card", "kempegowda", "bangaluru");
		AirportDTO ref11 = new AirportDTO("voter id", "RG", "hydrabad");
		AirportDAO ref2 = new AirportImplimentation();
		AirportAssociation ref3 = new AirportAssociation(ref2);
		ref3.save(ref1);
		ref3.findName("kempegowda");
		ref3.display();
		ref3.save(ref11);
		ref3.findName("sad");

		ref3.display();

	}

}
