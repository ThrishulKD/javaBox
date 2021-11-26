package com.xworkz.expection.email;

public class EmailStarter {

	public static void main(String[] args) throws EmailValidationException, StorageFullRunTimeException {


		EmailOperartor operator= new EmailOperartor();
		operator.save("kdthrishul@gmail.com");
		operator.save("dfkdfhk");
		operator.save(null);

	}

}
