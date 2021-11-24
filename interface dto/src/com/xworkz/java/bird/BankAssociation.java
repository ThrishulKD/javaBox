package com.xworkz.java.bird;

public class BankAssociation {
	BankDAO dao;

	public BankAssociation(BankDAO dao) {
		super();
		this.dao = dao;
	}

	public void save(BankDTO dto) {
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
