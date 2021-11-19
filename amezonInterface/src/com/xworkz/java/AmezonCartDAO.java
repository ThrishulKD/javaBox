package com.xworkz.java;

public interface AmezonCartDAO {
	
	boolean save(CartDTO cartDTO);
	CartDTO findByName(String name);
	void displayAllCartDetails();
	

}
