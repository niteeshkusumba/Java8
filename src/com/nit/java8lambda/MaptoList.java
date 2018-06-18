package com.nit.java8lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaptoList {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(10, "niteesh");
		map.put(15, "manish");
		map.put(30, "don");
		
		List<Integer> res = new ArrayList(map.keySet());
		res.forEach(System.out::println);
		
		List<String> res2 = new ArrayList(map.values());
		res2.forEach(System.out::println);
	}
}
