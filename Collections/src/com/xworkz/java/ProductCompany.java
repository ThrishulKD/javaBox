package com.xworkz.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ProductCompany {


	public static void main(String[] args) {

		List<String> pbc = new ArrayList<String>();
		pbc.add("Adobe");
		pbc.add("Amazon");
		pbc.add("CISCO");
		pbc.add("Amdocs");
		pbc.add("Facebook");
		pbc.add("Google");
		pbc.add("Microsoft");
		pbc.add("Hewlett-Packard (HP)");
		pbc.add("Informatica");
		pbc.add("CISCO");
		System.out.println("LIST");
		System.out.println(pbc.size());
		Collections.sort(pbc);
		System.out.println("acending order....");

		Iterator<String> itr = pbc.iterator();
		while (itr.hasNext()) {
			String type = itr.next();
			System.out.println(type);
		}

		System.out.println("----------------------------");
		System.out.println("descending...........");

		// Collections.sort(collection, Collections.reverseOrder());
		Comparator<String> comparator = new ProductCompany();
		Collections.sort(pbc, comparator);

		Iterator<String> itr1 = pbc.iterator();

		while (itr1.hasNext()) {
			String type = itr1.next();
			System.out.println(type);

		}

		System.out.println(
				"----------------------------------------------------------------------------------------------------");
		System.out.println("SET");
		Set<String> set1 = new TreeSet<String>();
		set1.add("Adobe");
		set1.add("Amazon");
		set1.add("CISCO");
		set1.add("Amdocs");
		set1.add("Facebook");
		set1.add("Google");
		set1.add("Microsoft");
		set1.add("Hewlett-Packard (HP)");
		set1.add("Informatica");
		set1.add("CISCO");

		System.out.println(set1.size());
		System.out.println("ascending order....");

		Iterator<String> itr2 = set1.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}

		System.out.println("----------------------------");
		System.out.println("descending order....");

		// Collections.sort(collection, Collections.reverseOrder());

		Comparator<String> comparator1 = new ProductCompany();
		Collections.sort(pbc, comparator1);
		Iterator<String> itr3 = pbc.iterator();
		while (itr3.hasNext()) {
			String type1 = itr3.next();
			System.out.println(type1);
		}

	}

}

