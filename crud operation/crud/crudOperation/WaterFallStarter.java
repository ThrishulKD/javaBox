package com.xworkz.crud.crudOperation;

public class WaterFallStarter {

	public static void main(String[] args) {

		WaterFalls ref = new WaterFalls();
		ref.getWaterFallsName();

		ref.addWaterFallsHeight(74.6f);
		ref.addWaterFallsHeight(36.5f);
		ref.addWaterFallsHeight(54.f);
		ref.addWaterFallsHeight(50.5f);
		ref.addWaterFallsHeight(100.5f);

		ref.displayDetails();

	}

}
