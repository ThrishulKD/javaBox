package com.xworkz.java.Stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Specs {

	public static void main(String[] args) {

		Stream<String> specs= Stream.of("Titan Eyeplus","Lenskart","Specsmakers","Himalaya Optical");
		
		List<String> ref= specs.sorted().map(e->e.toLowerCase()).collect(Collectors.toList());
		
		ref.forEach(e->System.out.println(e));
	}

}
