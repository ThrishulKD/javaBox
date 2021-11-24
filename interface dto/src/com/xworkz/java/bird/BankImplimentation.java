package com.xworkz.java.bird;

public class BankImplimentation implements BankDAO {

	BankDTO[] bank = new BankDTO[5];
	private int count = 0;

	@Override
	public boolean saveDetails(BankDTO dto) {
		System.out.println("invoked save method1");
		if (dto != null) {

			bank[count++] = dto;
			return true;
		} else {
			System.out.println("dto is null");
		}

		return false;
	}

	@Override
	public BankDTO findName(String name) {
		System.out.println("invoked find by name method");
		if (bank != null) {
			for (int i = 0; i < bank.length; i++) {
				BankDTO ref = bank[i];
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

		if (bank != null) {

			for (int i = 0; i < bank.length; i++) {

				BankDTO ref = bank[i];
				if (ref != null) {
					System.out.println(ref.getId());
					System.out.println(ref.getIfsc());
					System.out.println(ref.getName());
					System.out.println(ref.getBranch());

				}
			}
		}
	}

}
