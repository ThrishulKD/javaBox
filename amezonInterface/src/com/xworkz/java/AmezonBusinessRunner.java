package com.xworkz.java;

public class AmezonBusinessRunner {

	public static void main(String[] args) {


			
			CartDTO cartDTORef=new CartDTO("gadgets",5,20000.5f,"mobile");
			AmezonCartDAO amezonCartDAO=new ArrayAmazonCartDAO();
			AmezonBusiness business=new AmezonBusiness(amezonCartDAO);
			business.saveCart(cartDTORef);
			business.findCartByName(cartDTORef);
			business.displayCart();

		}

	}

