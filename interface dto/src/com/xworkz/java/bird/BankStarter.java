package com.xworkz.java.bird;

public class BankStarter {

	public static void main(String[] args) {


		BankDTO ref1 = new BankDTO("aadhar card","union","un0005", "madiker");
		BankDTO ref11 = new BankDTO("voter id", "canera","CAN356","virajpet");
		BankDAO ref2 = new BankImplimentation();
		BankAssociation ref3 = new BankAssociation(ref2);
		ref3.save(ref1);
		ref3.findName("canera");
		ref3.display();
		ref3.save(ref11);
		ref3.findName("scsc");

		ref3.display();

	}

}