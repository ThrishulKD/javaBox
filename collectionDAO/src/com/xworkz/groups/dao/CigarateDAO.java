package com.xworkz.groups.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CigarateDAO {

	private Collection<String> collection = new ArrayList<String>();

	public CigarateDAO() {

		collection.add("king");
		collection.add("flake");
		collection.add("mond");
		collection.add("black");

	}

	public boolean find(TotalSearch search, String value) {
		Iterator<String> itr = this.collection.iterator();
		while (itr.hasNext()) {
			String element = (String) itr.next();
			if (search.expressions(element, value)) {
				return true;
			}
		}
		return false;

	}

}
