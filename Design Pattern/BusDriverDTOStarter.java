package com.xworkz.DP;

import com.xworkz.DP.DTO.BusDriverDTO;

public class BusDriverDTOStarter {

	public static void main(String[] args) {

		BusDriverDTO driverDTO1 = new BusDriverDTO("chandra", 6.1f, 400f);
		BusDriverDTO driverDTO2 = new BusDriverDTO("prakash", 5.1f, 405f);
		BusDriverDTO driverDTO3 = new BusDriverDTO("ravi", 5.7f, 380f);
		BusDriverDTO driverDTO4 = new BusDriverDTO("kiran", 5.8f, 390f);

		BusDriverDTO[] ref = new BusDriverDTO[3];

		ref[1] = driverDTO3;
		ref[2] = driverDTO2;
		ref[0] = driverDTO1;

		for (int i = 0; i < ref.length; i++) {

			BusDriverDTO array = ref[i];
			System.out.println("name :".concat(array.getName()));
			System.out.println("Distance Coverd: ".concat(String.valueOf(array.getDrivigDistance())));
			System.out.println("Heigth of driver :".concat(String.valueOf(array.getHeight())));
			System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		}

	}

}
