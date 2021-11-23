package com.xworkz.bcci;

public class BcciStarter {

	public static void main(String[] args) {

		BcciDTO ref1= new BcciDTO("Ganguli",45,646644f);
		BcciRules ref2= new Bcci();
		BcciAssociation ref= new BcciAssociation(null);
		ref.saveBcci(ref1);
		ref.findBcciName(ref1);
		
		
		

	}

}
