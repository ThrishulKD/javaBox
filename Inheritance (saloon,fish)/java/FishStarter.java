package com.xworkz.java;

public class FishStarter {

	public static void main(String[] args) {

		Fish shark1 = new SharkFish();
		SharkFish shark = new SharkFish(5f, 5000f);
		Fish fish = new Fish("indian ocean", true);

		Fish goldFish = new GoldFish();
		GoldFish goldFish1 = new GoldFish("blue", 5f);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

	}

}
