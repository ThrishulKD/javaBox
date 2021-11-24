package com.xworkz.java.bird;

public interface BankDAO {

	boolean saveDetails(BankDTO dto);

	BankDTO findName(String name);

	public void display();
}
