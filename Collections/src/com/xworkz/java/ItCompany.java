package com.xworkz.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ItCompany {

	public static void main(String[] args) {

		List<String> itc = new ArrayList<String>();
		itc.add("Tata Consultancy service");
		itc.add("Infosys");
		itc.add("HCL Technologies");
		itc.add("Wipro");
		itc.add("Redington India Ltd");
		itc.add("Tech Mahindra Ltd");
		itc.add("Larsen & Toubro Infotech Ltd");
		itc.add("Mphasis Ltd");
		itc.add("Mindtree Ltd");
		itc.add("Hexaware Technologies Ltd");
		System.out.println("LIST");
		System.out.println(itc.size());
		Collections.sort(itc);
		System.out.println("acending order....");

		Iterator<String> itr = itc.iterator();
		while (itr.hasNext()) {
			String type = itr.next();
			System.out.println(type);
		}

		System.out.println("----------------------------");
		System.out.println("descending...........");

		// Collections.sort(collection, Collections.reverseOrder());
		Comparator<String> comparator = new ITCompany();
		Collections.sort(itc, comparator);

		Iterator<String> itr1 = itc.iterator();

		while (itr1.hasNext()) {
			String type = itr1.next();
			System.out.println(type);

		}

		System.out.println(
				"----------------------------------------------------------------------------------------------------");
		System.out.println("SET");
		Set<String> set1 = new TreeSet<String>();
		set1.add("Tata Consultancy service");
		set1.add("Infosys");
		set1.add("HCL Technologies");
		set1.add("Wipro");
		set1.add("Redington India Ltd");
		set1.add("Tech Mahindra Ltd");
		set1.add("Larsen & Toubro Infotech Ltd");
		set1.add("Mphasis Ltd");
		set1.add("Mindtree Ltd");
		set1.add("Hexaware Technologies Ltd");

		System.out.println(set1.size());
		System.out.println("ascending order....");

		Iterator<String> itr2 = set1.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}

		System.out.println("----------------------------");
		System.out.println("descending order....");

		// Collections.sort(collection, Collections.reverseOrder());

		Comparator<String> comparator1 = new Comparator<String>();
		Collections.sort(itc, comparator1);
		Iterator<String> itr3 = itc.iterator();
		while (itr3.hasNext()) {
			String type1 = itr3.next();
			System.out.println(type1);
		}

	}

}
