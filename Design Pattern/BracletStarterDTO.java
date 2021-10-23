package com.xworkz.DP;

import com.xworkz.DP.DTO.BracletDTO;

public class BracletStarterDTO {

	public static void main(String[] args) {

		BracletDTO ref = new BracletDTO();

		ref.setColor("red");
		ref.setGemUsed(false);
		ref.setMaterial("copper");
		ref.setPrice(10.5f);
		ref.setGifted(true);

		BracletDTO ref1 = new BracletDTO("plastic", 20.5f, "pink", true, false);
		BracletDTO ref2 = new BracletDTO("plastic", 30.5f, "green", true, false);
		BracletDTO ref3 = new BracletDTO("plastic", 40.5f, "black", true, false);
		BracletDTO ref4 = new BracletDTO("plastic", 10.5f, "brown", true, true);
		BracletDTO ref5 = new BracletDTO("plastic", 80.5f, "grey", true, false);

		BracletDTO[] fig = new BracletDTO[5];

		fig[0] = ref1;
		fig[4] = ref5;
		fig[1] = ref3;
		fig[2] = ref4;
		fig[3] = ref2;

		for (int i = 0; i < fig.length; i++) {

			BracletDTO val = fig[i];
			
			if(val!=null) {

			System.out.println("material ".concat(val.getMaterial()));
			System.out.println("price ".concat(String.valueOf(val.getPrice())));
			System.out.println("colour ".concat(val.getColor()));
			System.out.println("isgem  "+val.isGemUsed());
			System.out.println("isgifted ".concat(String.valueOf(val.isGifted())));
			}
			else {
				System.out.println("array index is pointing to null".concat(String.valueOf(val)));
			}

		}

	}

}
