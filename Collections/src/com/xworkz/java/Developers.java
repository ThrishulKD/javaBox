package com.xworkz.java;

import java.awt.List;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.text.html.HTMLDocument.Iterator;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;

public class Developers {

	

		public static void main(String[] args) {

			List <String> developerNames= new ArrayList();
			developerNames.add("pretham");
			developerNames.add("jon");
			developerNames.add("karim");
			developerNames.add("bromi");
			developerNames.add("Rakesh");
			developerNames.add("jade");
			developerNames.add("keerthi");
			developerNames.add("shaun");
			developerNames.add("perl");
			developerNames.add("flower");
			System.out.println("LIST");
			System.out.println(developerNames.size());
			
			Collections.sort(developerNames);
			System.out.println("acending order....");

			Iterator <String> itr = developerNames.iterator();
			while (itr.hasNext()) {
				String type = itr.next();
				System.out.println(type);
			}

			System.out.println("----------------------------");
			System.out.println("descending...........");

			// Collections.sort(collection, Collections.reverseOrder());
			Comparator<String> comparator = new Comparator<String>();
			Collections.sort(developerNames, comparator);

			Iterator itr1 = developerNames.iterator();

			while (itr1.hasNext()) {
				String type = itr1.next();
				System.out.println(type);

			}

			System.out.println(
					"----------------------------------------------------------------------------------------------------");
			System.out.println("SET");
			Set<String> set1 = new TreeSet<String>();
			set1.add("pretham");
			set1.add("jon");
			set1.add("karim");
			set1.add("bromi");
			set1.add("Rakesh");
			set1.add("jade");
			set1.add("keerthi");
			set1.add("shaun");
			set1.add("perl");
			set1.add("flower");

			System.out.println(set1.size());
			System.out.println("ascending order....");

			Iterator<String> itr2 = set1.iterator();
			
			while (itr2.hasNext()) {
				System.out.println(itr2.next());
			}

			System.out.println("----------------------------");
			System.out.println("descending order....");

			// Collections.sort(collection, Collections.reverseOrder());

			Comparator<String> comparator1 = new DevelopersName();
			Collections.sort(developerNames, comparator1);
			Iterator<String> itr3 = developerNames.iterator();
			while (itr3.hasNext()) {
				String type1 = itr3.next();
				System.out.println(type1);
			}

		}

	}
