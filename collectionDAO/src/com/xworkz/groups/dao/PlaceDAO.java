package com.xworkz.groups.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class PlaceDAO {

	private Collection<String> places = new ArrayList<String>();

	public boolean save(String name) {

		return this.places.add(name);
	}

	public boolean findMatch(String place) {

		if (place != null) {

			if (places.contains(place)) {
				System.out.println("place is matched");
				return true;
			}

		}
		return false;
	}

	public boolean findMatchInsensitive(String name) {
		if (name != null) {
			Iterator<String> itr = places.iterator();
			while (itr.hasNext()) {
				String ele = itr.next();
				if (ele.equalsIgnoreCase(name)) {
					System.out.println("place is matched");
					return true;
				}

			}

		}
		return false;
	}

	public boolean findMatchStartswith(String chars) {
		System.out.println("invoked findMatchStartswith");
		Iterator<String> itr = places.iterator();
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
		Iterator<String> itr = places.iterator();
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
