package com.nit.java8lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMap {

	public static void main(String args[]) {
		List<String> firstNames= Arrays.asList("niteesh", "manish", "don");
		List<String> lastNames= Arrays.asList("kusumba", "bharadwaz", "robin");
		
		List<String> names= Stream
				.of(firstNames, lastNames)
				.flatMap(n -> n.stream())
				.collect(Collectors.toList());
		names.forEach(System.out::println);
		
	}
}
