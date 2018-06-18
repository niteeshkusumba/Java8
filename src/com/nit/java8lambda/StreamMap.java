package com.nit.java8lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMap {

	public static void main(String[] args) {
		ArrayList<Names> names=new ArrayList<Names>();
		names.add(new Names("niteesh", "kusumba", 24));
		names.add(new Names("manish", "bharadwaj", 27));
		names.add(new Names("don", "robin", 32));
		
		List<String> n= names.stream().map((Names nam) ->{
			return nam.getFirstname();
		}).collect(Collectors.toList());
		System.out.println(n);
	}
}