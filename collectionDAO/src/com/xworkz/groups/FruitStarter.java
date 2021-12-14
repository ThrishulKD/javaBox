package com.xworkz.groups;

import java.util.Iterator;

import com.xworkz.groups.dao.FruitsDAO;

public class FruitStarter {

	public static void main(String[] args) {

		FruitsDAO dao = new FruitsDAO();
		dao.save("mango");
		dao.save("Apple");
		dao.save("orange");
		dao.save("pineapple");
		dao.save("grapes");

		boolean ref4 = dao.findMatch("grapes");
		System.out.println(ref4);
		boolean ref = dao.findMatchInsensitive("aPPlE");
		System.out.println(ref);

		boolean ref1 = dao.findMatchStartswith("gr");
		System.out.println(ref1);

		boolean ref2 = dao.findMatchEndswith("ll");
		System.out.println(ref2);

	}

}
