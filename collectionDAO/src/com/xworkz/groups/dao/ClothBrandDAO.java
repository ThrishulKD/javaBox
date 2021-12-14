package com.xworkz.groups.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ClothBrandDAO {

	Collection<String> collection = new ArrayList<String>();

	public boolean save(String brand) {
		System.out.println("invoked save method");
		return this.collection.add(brand);
	}

	public boolean findMatch(String brand) {

		if (brand != null) {

			if (collection.contains(brand)) {
				System.out.println("brand is matched");
				return true;
			}

		}
		return false;
	}

	public boolean findMatchInsensitive(String brand) {
		if (brand != null) {
			Iterator<String> itr = collection.iterator();
			while (itr.hasNext()) {
				String ele = itr.next();
				if (ele.equalsIgnoreCase(brand)) {
					System.out.println("brand is matched");
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
				System.out.println("brand is matched");
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
