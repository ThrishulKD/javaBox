package com.xworkz.bcci;

import java.util.Iterator;

public class Bcci implements BcciRules{
	
	private BcciDTO[] bcciDto = new BcciDTO[5];
	private int counter=0;

	@Override
	public void Country(BcciDTO bcci) {
		System.out.println("invoked country method");
		if(bcci!=null) {
			bcciDto[counter]=bcci;
			counter++;
		}
		
	}
	
	@Override
	public BcciDTO StadiumRules(int noOfStadium) {
		System.out.println("invoked stadium rules method");
		if(noOfStadium!=0) {
		for (int i = 0; i < bcciDto.length; i++) {
			BcciDTO ref1= bcciDto[i];
			System.out.println(ref1.getNoOfStatium());
		}
			
		}
		return null;
	}
	@Override
	public void playerRules() {
		System.out.println("players method");
		
	}

}
