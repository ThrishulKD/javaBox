package com.xworkz.java.Stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AirportNames {

	public static void main(String[] args) {

		String name1 = "KIAB";
		String name2 = "sri Guru Ram Dass Jee International Airport";
		String name3 = "Jaipur International Airport";
		String name4 = "Chennai International Airport";
		String name5 = "mumbai International Airport";
		String name6 = "pune International Airport";
		String name7 = "delhi International Airport";
		String name8 = "salam International Airport";
		String name9 = "hubli International Airport";
		String name10 = "mysore International Airport";
		String name11 = "madikeri International Airport";
		String name12 = "btm International Airport";
		String name13 = "ladak International Airport";
		String name14 = "shimla International Airport";
		String name15 = "kochi International Airport";
		String name16 = "jamkandi International Airport";
		String name17 = "davanagere International Airport";
		String name18 = "daravi International Airport";
		String name19 = "hydrabad International Airport";
		String name20 = "ooty International Airport";

		Stream<String> val = Stream.of(name1,name2,name3, name4, name5, name6, name7, name8, name9, name10, name11,
				name12, name13, name14, name15, name16, name17, name18, name19, name20);

		List<String> airport = val.filter((e) -> e.startsWith("s")).map((g)->g.toLowerCase()).collect(Collectors.toList());
airport.forEach(e->System.out.println(e));
	}

}
