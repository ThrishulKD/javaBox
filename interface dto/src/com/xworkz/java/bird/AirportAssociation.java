package com.xworkz.java.bird;

public class AirportAssociation {

	AirportDAO dao;

	public AirportAssociation(AirportDAO dao) {
		super();
		this.dao = dao;
	}

	public void save(AirportDTO dto) {
		if (dao != null) {

			dao.saveDetails(dto);

		}

	}

	public void findName(String name) {
		if (dao != null) {
			dao.findName(name);
		}
	}

	public void display() {
		if (dao != null) {
			dao.display();
		}
	}

}
