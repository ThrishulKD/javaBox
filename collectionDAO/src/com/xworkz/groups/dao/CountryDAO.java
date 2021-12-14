package com.xworkz.groups.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CountryDAO {

	Collection<String> collection = new ArrayList<String>();

	public boolean save(String country) {
		System.out.println("invoked save method");
		return this.collection.add(country);
	}

	public boolean findMatch(String country) {

		if (country != null) {

			if (collection.contains(country)) {
				System.out.println("place is matched");
				return true;
			}

		}
		return false;
	}

	public boolean findMatchInsensitive(String country) {
		if (country != null) {
			Iterator<String> itr = collection.iterator();
			while (itr.hasNext()) {
				String ele = itr.next();
				if (ele.equalsIgnoreCase(country)) {
					System.out.println("place is matched");
					return true;
				}

			}

		}
		return false;
	}

	public boolean findMatchStartswith(String chars) {
		System.out.println("invoked findMatchStartswith");
		Iterator<String> itr = collection.iterator();
		while (itr.hasNext()) {
			String ele = itr.next();
			if (ele.toUpperCase().startsWith(chars.toUpperCase())) {
				System.out.println("place is matched");
				return true;
			}

		}
		return false;
	}

	public boolean findMatchEndswith(String chars) {
		System.out.println("invoked findMatchEndswith");
		Iterator<String> itr = collection.iterator();
		while (itr.hasNext()) {
			String ele = itr.next();
			if (ele.toUpperCase().endsWith(chars.toUpperCase())) {
				System.out.println("place is matched");
				return true;
			}

		}
		return false;
	}

}
