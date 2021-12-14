package com.xworkz.groups;

import java.util.Iterator;

import com.xworkz.groups.dao.PlaceDAO;

public class PlaceStarter {

	public static void main(String[] args) {

		PlaceDAO dao = new PlaceDAO();
		dao.save("bangalore");
		dao.save("mysore");
		dao.save("madikeri");
		dao.save("ooty");
		dao.save("manali");

		boolean ref4 = dao.findMatch("bangalore");
		System.out.println(ref4);
		boolean ref = dao.findMatchInsensitive("Manali");
		System.out.println(ref);

		boolean ref1 = dao.findMatchStartswith("My");
		System.out.println(ref1);

		boolean ref2 = dao.findMatchEndswith("Ty");
		System.out.println(ref2);

	}

}
