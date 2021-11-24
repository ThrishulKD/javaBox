package com.xworkz.java.bird;

public class AirportImplimentation implements AirportDAO {

	AirportDTO[] air = new AirportDTO[5];
	private int count = 0;

	@Override
	public boolean saveDetails(AirportDTO dto) {
		System.out.println("invoked save method1");
		if (dto != null) {

			air[count++] = dto;
			return true;
		} else {
			System.out.println("dto is null");
		}

		return false;
	}

	@Override
	public AirportDTO findName(String name) {
		System.out.println("invoked find by name method");
		if (air != null) {
			for (int i = 0; i < air.length; i++) {
				AirportDTO ref = air[i];
				if (ref != null) {
					String Name1 = ref.getName();

					if (name.equals(Name1)) {
						System.out.println(name + " is found");
						System.out.println("````````````````````````````");
					} else {
						System.out.println(name + " is not is found");
					}
				}
			}
		}
		return null;
	}

	@Override
	public void display() {
		System.out.println("``````````````````````````");

		System.out.println("invoked display method");

		if (air != null) {

			for (int i = 0; i < air.length; i++) {

				AirportDTO ref = air[i];
				if (ref != null) {
					System.out.println(ref.getId());
					System.out.println(ref.getLocation());
					System.out.println(ref.getName());

				}
			}
		}
	}

}
