package com.xworkz.groups;


import java.util.Iterator;

import com.xworkz.groups.dao.CountryDAO;


public class CountryStarter {
	



		public static void main(String[] args) {

			CountryDAO dao = new CountryDAO();
			dao.save("india");
			dao.save("Australia");
			dao.save("brazil");
			dao.save("china");
			dao.save("pakistan");

			boolean ref4 = dao.findMatch("india");
			System.out.println(ref4);
			boolean ref = dao.findMatchInsensitive("ChInA");
			System.out.println(ref);

			boolean ref1 = dao.findMatchStartswith("br");
			System.out.println(ref1);

			boolean ref2 = dao.findMatchEndswith("Il");
			System.out.println(ref2);

		}

	}


