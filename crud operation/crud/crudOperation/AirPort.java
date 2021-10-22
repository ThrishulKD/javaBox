package com.xworkz.crud.crudOperation;

public class AirPort {

	private String[] names = new String[5];
	private int count = 0;

	public void addAirPortNames(String name) {

		this.names[this.count] = name;
		if (count < names.length && names.length >= 0) {
			System.out.println("airport :".concat(name));

			this.count++;
		} else {

			System.out.println("yaavano evnu array full aagide ".concat(name));
		}
	}

	public String[] getAirPortNames() {
		return this.names;

	}

	public void delete(int digit) {
		if (digit < names.length && names.length >= 0) {
			names[digit] = null;
		} else {
			System.out.println("idu aagalla :" .concat(String.valueOf(digit)));
		}
	}

	public void update(int digit, String name) {
		if (digit < names.length && names.length >= 0) {

			names[digit] = name;
		}
		else {
			System.out.println("idusa agalla : ".concat(String.valueOf(digit)).concat(" ").concat(name));
		}

	}

}
