
package com.xworkz.groups.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class PincodeDAO {

	Collection<Integer> collection = new ArrayList<Integer>();

	public boolean save(int pincode) {
		System.out.println("invoked save method");
		return this.collection.add(pincode);
	}

	public boolean findMatch(int pincode) {
		if (pincode != 0) {
			Iterator<Integer> itr = collection.iterator();
			while (itr.hasNext()) {
				int ele = itr.next();
				if (ele == pincode) {
					System.out.println("pincode is matched");
					return true;
				}

			}

		}
		return false;
	}

	/*public boolean findMatchStartswith(int pincode) {
		System.out.println("invoked findMatchStartswith");
		Iterator<Integer> itr = collection.iterator();
		while (itr.hasNext()) {
			int ele = itr.next();
			Integer val = new Integer(ele);

			Integer ref = new Integer(pincode);

			System.out.println("place is matched");
			return true;
		}
		return false;
*/
	}


