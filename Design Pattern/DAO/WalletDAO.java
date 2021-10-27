package com.xworkz.DP.DAO;

import com.xworkz.DP.DTO.WalletDTO;

public class WalletDAO {
	private WalletDTO[] walletdtos = new WalletDTO[5];
	private int count = 0;

	public void savewallet(WalletDTO random) {
		if (random != null && count <= walletdtos.length) {
			walletdtos[count++] = random;
			System.out.println("random is added" + random.getCompanyName());
		} else {
			System.out.println("invalid index");
		}
	}

	public void saveWallet(WalletDTO random, int digit) {

		if (random != null && count <= walletdtos.length) {
			walletdtos[digit] = random;
			System.out.println("specific index value is added " + random.getCompanyName() + digit);
			count++;
		} else {

			System.out.println("invalid index or pointing to null");
		}

	}

	public void indexOccupied() {

		System.out.println(count);

	}

	public boolean search(String name) {

		System.out.println("invoked search method");
		for (int i = 0; i < walletdtos.length; i++) {
			WalletDTO ref = walletdtos[i];
			if (ref != null) {

				String val = ref.getCompanyName();
				System.out.println(val);
				if (name.equals(val)) {
					System.out.println("found");
					return true;

				} else {
					System.out.println("name not found");
				}
			}
		}

		return false;
	}
	
	public WalletDTO[] getDetails() {
		
		return walletdtos;
	}

}
