package com.xworkz.crud.crudOperation;

public class Stadium {
	private String[] names = new String[5];
	private int var = 0;

	public void addStadiumNames(String name) {

		if (var < names.length && names.length >= 0) {
			System.out.println("stadium name ".concat(name));
			this.names[this.var++] = name;
		} else {
			System.out.println("array is full");
		}
	}

	public String[] getStadiumNames() {
		return this.names;
	}

	public void delete(int number) {

		if (number < names.length && names.length >= 0) {
			names[number] = null;
		} else {
			System.out.println("cannot delete index ".concat(String.valueOf(number)));

		}
	}

	public void update(int number, String name) {
		if (number < names.length && names.length >= 0) {
			names[number] = name;
		}

		else {
			System.out.println("cannot update index ".concat(String.valueOf(number).concat("  ").concat(name)));
		}

	}

}
