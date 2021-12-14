
package com.xworkz.groups;

import java.util.Iterator;

import com.xworkz.groups.dao.ClothBrandDAO;

public class ClothBrandStarter {

	public static void main(String[] args) {

		ClothBrandDAO dao = new ClothBrandDAO();
		dao.save("puma");
		dao.save("bofello");
		dao.save("levis");
		dao.save("wrongn");
		dao.save("peterEngland");

		boolean ref4 = dao.findMatch("levis");
		System.out.println(ref4);
		boolean ref = dao.findMatchInsensitive("WroNgN");
		System.out.println(ref);

		boolean ref1 = dao.findMatchStartswith("l");
		System.out.println(ref1);

		boolean ref2 = dao.findMatchEndswith("is");
		System.out.println(ref2);

	}

}
