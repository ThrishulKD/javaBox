package com.xworkz.java.Stream;

import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AirQualityIndex {

	public static void main(String[] args) {

		Integer airQualityIndex1 = 120;
		Integer airQualityIndex2 = 126;
		Integer airQualityIndex3 = 111;
		Integer airQualityIndex4 = 12;
		Integer airQualityIndex5 = 101;
		Integer airQualityIndex6 = 124;
		Integer airQualityIndex7 = 89;
		Integer airQualityIndex8 = 178;
		Integer airQualityIndex9 = 99;
		Integer airQualityIndex10 = 103;
		Integer airQualityIndex11 = 104;
		Integer airQualityIndex12 = 105;
		Integer airQualityIndex13 = 69;
		Integer airQualityIndex14 = 107;
		Integer airQualityIndex15 = 108;
		Integer airQualityIndex16 = 109;
		Integer airQualityIndex17 = 70;
		Integer airQualityIndex18 = 112;
		Integer airQualityIndex19 = 117;
		Integer airQualityIndex20 = 149;

		Stream<Integer> val = Stream
				.of(airQualityIndex1, airQualityIndex2, airQualityIndex3, airQualityIndex4, airQualityIndex5,
						airQualityIndex6, airQualityIndex7, airQualityIndex8, airQualityIndex9, airQualityIndex10,
						airQualityIndex11, airQualityIndex12, airQualityIndex13, airQualityIndex14, airQualityIndex15,
						airQualityIndex16, airQualityIndex17, airQualityIndex18, airQualityIndex19, airQualityIndex20);
			List<Integer> integer=val.filter((e)->e<100).sorted((e1,e2)->e2.compareTo(e1)).collect(Collectors.toList());

		integer.forEach(e -> System.out.println(e));
		
		

	}

}
