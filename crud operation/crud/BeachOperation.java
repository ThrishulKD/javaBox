package com.xworkz.crud;

import com.xworkz.crud.crudOperation.BeachStarter;

public class BeachOperation {
	
	public static void main(String[] arg) {
		
		BeachStarter ref=new BeachStarter();
		String cname=ref.getCountry();
		System.out.println(cname);
		
		ref.addBeachNames("baga beach");
		ref.addBeachNames("panambur beach");
		ref.addBeachNames("kudla beach");
		ref.addBeachNames("gokarna beach");
		ref.addBeachNames("malpe beach");
		ref.displayBeachNames();
		
		
		
	}

}
