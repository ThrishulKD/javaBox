package com.xworkz.java.bird;

public class BusAssociation {

	BusRouteDAO dao;

	public BusAssociation(BusRouteDAO dao) {
		super();
		this.dao = dao;
	}

	public void save(BusRouteDTO dto) {
		if (dao != null) {

			dao.saveDetails(dto);

		}

	}

	public void findDriverName(String name) {
		if (dao != null) {
			dao.findDriverName(name);
		}
	}

	public void delete(String point) {
		if (dao != null) {
			dao.deleteStartingPoint(point);
		}
	}

	public void display() {
		if (dao != null) {
			dao.display();
		}
	}

}
