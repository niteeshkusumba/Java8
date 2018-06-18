package com.nit.java8lambda;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFilter {

	public static void main(String[] args) {
		
	Stream<String> names = Stream.of("niteesh", null, "manish", "sp", "don");
		
		List<String> filter= names.filter(n-> n!=null &&n.length()>2).collect(Collectors.toList());
		System.out.println(filter);
	}
}
