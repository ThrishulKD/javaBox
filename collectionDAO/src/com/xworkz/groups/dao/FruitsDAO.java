package com.xworkz.groups.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class FruitsDAO {

	Collection<String> collection = new ArrayList<String>();

	public boolean save(String fruit) {
		System.out.println("invoked save method");
		return this.collection.add(fruit);
	}

	public boolean findMatch(String fruit) {

		if (fruit != null) {

			if (collection.contains(fruit)) {
				System.out.println("fruit is matched");
				return true;
			}

		}
		return false;
	}

	public boolean findMatchInsensitive(String fruit) {
		if (fruit != null) {
			Iterator<String> itr = collection.iterator();
			while (itr.hasNext()) {
				String ele = itr.next();
				if (ele.equalsIgnoreCase(fruit)) {
					System.out.println("fruit is matched");
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
				System.out.println("fruit is matched");
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
				System.out.println("fruit is matched");
				return true;
			}

		}
		return false;
	}

}
