package com.xworkz.java.Stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Satellites {

	public static void main(String[] args) {

		Stream<String> ref1 = Stream.of("GSLV1", "PSLC1", "GSLV2", "GSLV3", "MANGALAYAN", "ARYABHATTA");
		Stream<String> ref2 = Stream.of("GSLV1", "PSLC1", "GSLV2", "GSLV3", "MANGALAYAN", "ARYABHATTA");

		List<String> satellite1 = ref1.sorted((a1, a2) -> a1.compareToIgnoreCase(a2)).collect(Collectors.toList());
		List<String> satellite2 = ref2.sorted((e1, e2) -> e2.compareToIgnoreCase(e1)).collect(Collectors.toList());
		System.out.println("~~~~~~~~~~~~~~~~ascending~~~~~~~~~~~~~~~~");
		satellite1.forEach((a) -> System.out.println(a));
		System.out.println("~~~~~~~~~~~~~~~~descending~~~~~~~~~~~~~~~~");
		satellite2.forEach((e) -> System.out.println(e));
		
		
	}

}
