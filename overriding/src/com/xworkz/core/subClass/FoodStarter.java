package com.xworkz.core.subClass;

import com.xworkz.core.subClass.parentClass.Food;

public class FoodStarter {

	public static void main(String[] args) {

		Food food =new Food(44f, "super");
		Food food2 =new Food(44f, "super");
		
		food.equals(food2);
		food.setName("biriyani");
		System.out.println(food.getName());
		System.out.println(food.getPrice());

	}

}
