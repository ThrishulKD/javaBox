package com.xworkz.expection.pan;

import com.xworkz.expection.email.StorageFullRunTimeException;

public class PanStarter {
	
	public static void main(String[] args) throws ValidPanException, StorageFullRunTimeException {
		
		PanOperator pan= new PanOperator();
		pan.save("GDPPD6413j");
		pan.save("sd@nd");
	}
	

}
