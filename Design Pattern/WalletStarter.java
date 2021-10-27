package com.xworkz.DP;

import com.xworkz.DP.DAO.WalletDAO;
import com.xworkz.DP.DTO.WalletDTO;

public class WalletStarter {
	public static void main(String[] arg) {
		// (String companyName, String material, int totalCompartment, float price,
		// boolean coinCompartment)

		WalletDTO ref = new WalletDTO("puma", "leather", 2, 50.f, true);
		WalletDTO ref1 = new WalletDTO("wrongn", "leathet", 3, 100f, false);

		WalletDAO val = new WalletDAO();
		val.savewallet(ref1);
		val.saveWallet(ref, 1);

		val.indexOccupied();
		val.search("puma");

		WalletDTO[] array = val.getDetails();
		for (int i = 0; i < array.length; i++) {
			WalletDTO arr = array[i];
			System.out.println("`````````````````````````````");
			if (arr != null) {
				System.out.println("company name ".concat(arr.getCompanyName()));
				System.out.println("material ".concat(arr.getMaterial()));
				System.out.println("total compartment ".concat(String.valueOf(arr.getTotalCompartment())));
				System.out.println("price ".concat(String.valueOf(arr.getPrice())));
				System.out.println("coin compartment ".concat(String.valueOf(arr.isCoinCompartment())));
			} else {
				System.out.println("wallet bul gayi");
			}
		}

	}
}
