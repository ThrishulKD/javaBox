package com.xworkz.crud;

import com.xworkz.crud.crudOperation.Restaurant;

public class RestaurantStarter {

	public static void main(String[] args) {

		Restaurant ref = new Restaurant();
		ref.getRestaurantName();

		ref.addRestaurantLocation("BTM");
		ref.addRestaurantLocation("HOSA ROAD");
		ref.addRestaurantLocation("MEJESTIC");
		ref.addRestaurantLocation("SILK BOARD");
		ref.addRestaurantLocation("BANASHANKARI");


		ref.displayDetails();

	}

}
