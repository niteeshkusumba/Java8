package com.nit.java8lambda;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamtoList {

	public static void main(String[] args) {
		
		 Stream<String> lang = Stream.of("English", "Telugu", "Tamil", "Malayalam", "Hindi");
		 List<String> lst = lang.collect(Collectors.toList());
		 System.out.println(lst);

	}
}
