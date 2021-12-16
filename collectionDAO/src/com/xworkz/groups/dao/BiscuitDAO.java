package com.xworkz.groups.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class BiscuitDAO {

	private Collection<String> biscuitcollection = new ArrayList<String>();

	public BiscuitDAO() {

		biscuitcollection.add("borban");
		biscuitcollection.add("crack jack");
		biscuitcollection.add("gooday");
		biscuitcollection.add("5050");
	}

	public boolean find(TotalSearch search, String value) {
		Iterator<String> itr = this.biscuitcollection.iterator();
		while (itr.hasNext()) {
			String element = (String) itr.next();
			if (search.expressions(element, value)) {
				return true;
			}
		}
		return false;

	}

}
