package com.xworkz.crud.crudOperation;

public class CoolDrink {

	private String[] brandNames = new String[5];
	private int count = 0;

	public void addBrandNames(String name) {

//		System.out.println("invoked brand names"));

		if (count < brandNames.length) {
			this.brandNames[this.count++] = name;
			System.out.println("invoked brand names: ".concat(name));
			//count++;
		} else {
			System.out.println("array is full");
		}

		// array is add
	}

	public String[] getBrandNames() {

		return this.brandNames;
	}

	public void delete(int name) {
			System.out.println("delete index :".concat(String.valueOf(name)));
		if (name < this.brandNames.length && this.brandNames.length >= 0) {
			this.brandNames[name] = null;

		} else {

			System.out.println("cannot delete");
		}
	}

	public void update(int digit, String name) {
		
		System.out.println("update index: ".concat(String.valueOf(digit).concat("  ").concat(name)));
		if (digit < this.brandNames.length && this.brandNames.length >= 0) {
			this.brandNames[digit] = name;

		} else {

			System.out.println("cannot update");
		}

	}

}
