package com.xworkz.java.bird;

public class BirdAssociation {

	BirdInterface dao;
	

	public BirdAssociation(BirdInterface dao) {
		super();
		this.dao = dao;
	}
	public void saveBird(BirdDTO dto) {
		if (dto != null) {
			dao.saveBirdData(dto);

			System.out.println("invoked save method");
		} else {
			System.out.println("dto is pointing to null");
		}
	}

	public void getBirdage(BirdDTO dto) {

		if (dto != null) {
			dao.findAge(1);
			dao.findAge(2);
		}

	}

	public void displayDetails() {
		System.out.println("invoked display method");
		if (dao != null) {

			dao.displayBirdDetails();

		}
		else {
			System.out.println("dao in null cannot display");
		}

	}

}
