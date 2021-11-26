package com.xworkz.expection.email;

public class StorageFullRunTimeException extends Exception {
	
	private static String wrong;

	public StorageFullRunTimeException() {
		super(wrong);
	}

}
