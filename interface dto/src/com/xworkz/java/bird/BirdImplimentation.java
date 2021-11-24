package com.xworkz.java.bird;

public class BirdImplimentation implements BirdInterface {

	BirdDTO[] dto = new BirdDTO[5];
	int counter = 0;

	@Override
	public boolean saveBirdData(BirdDTO birddto) {
		System.out.println("invoked saveBirdMethod");
		if (birddto != null) {
			dto[counter++] = birddto;
			return true;

		} else {
			System.out.println("bird dto is null");
		}

		return false;
	}

	@Override
	public BirdDTO findAge(int age) {
		System.out.println("invoked find age method");
		if (dto != null) {

			for (int i = 0; i < dto.length; i++) {
				BirdDTO ref = dto[i];
				if (ref != null) {

					int age1 = ref.getAge();
					// String.valueOf(age1);
					if (age == age1) {
						System.out.println("bird age found in index: " +i);
					} else {
						System.out.println("bird age not found");
					}

				} else {
					System.out.println("ref of dto is pointing to null");
				}
			}
		} else {
			System.out.println("dto is pointing to null");
		}
		return null;
	}

	@Override
	public void displayBirdDetails() {
		if (dto != null) {

			for (int i = 0; i < dto.length; i++) {

				BirdDTO birdDto = dto[i];
				if (birdDto != null) {
					System.out.println("``````````````````````````");
					System.out.println("from implimentation");
					System.out.println("bird age: "+birdDto.getAge());
					System.out.println("bird breed: "+birdDto.getBreed());
					System.out.println("bird id: "+birdDto.getId());
					System.out.println("bird origin: "+birdDto.getOrigin());
					System.out.println("can fly: "+birdDto.isCanfly());

				}
			}
		}

	}

}
