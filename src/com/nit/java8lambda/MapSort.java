package com.nit.java8lambda;

import java.util.HashMap;
import java.util.Map;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.LinkedHashMap;


public class MapSort {

	public static void main(String[] args) {
		Map<String, Integer> data= new HashMap<String, Integer>();
		data.put("b", 10);
		data.put("d", 7);
		data.put("a",4);
		data.put("c",2);
	
	 	Map<String, Integer> result = data.entrySet().stream()
	 			.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
	 			.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
	 					(oldValue, newValue) -> oldValue, LinkedHashMap::new));
	 	System.out.println(result);
	}
	
}
