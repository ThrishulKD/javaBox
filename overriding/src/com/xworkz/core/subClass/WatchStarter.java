package com.xworkz.core.subClass;

import com.xworkz.core.subClass.parentClass.Watch;

public class WatchStarter {

	public static void main(String[] args) {
		
		Watch watch= new Watch("rolex",20000f);
		Watch watch1= new Watch("rolex", 20000f);
		watch.equals(watch1);
		System.out.println(watch.getType().ANALOG);
		System.out.println(watch1.hashCode());
		System.out.println(watch.toString());

	}

}
