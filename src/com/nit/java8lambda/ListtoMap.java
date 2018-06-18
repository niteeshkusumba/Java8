package com.nit.java8lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListtoMap {

	public static void main(String[] args) {
		List<Names> names= new ArrayList<>();
		names.add(new Names("niteesh", "kusumba", 24));
		names.add(new Names("manish", "bharadwaj", 27));
		names.add(new Names("don", "robin", 32));
		
		names.forEach(item -> System.out.println(item));
		System.out.println();
		
		Map<String, Names> map= new HashMap<>();
		map= names.stream().collect(Collectors.toMap(item -> item.getFirstname(), item -> item));
		System.out.println("Fname  |   Name");
		System.out.println("--------------------------");
		map.forEach((k,v)->System.out.println(k+ " = "+ v));
	}
}
