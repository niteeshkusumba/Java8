package com.nit.java8lambda;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class StreamGroupingBy {

	public static void main(String[] args) {
		ArrayList<Names> names=new ArrayList<Names>();
		names.add(new Names("niteesh", "kusumba", 24));
		names.add(new Names("manish", "bharadwaj", 27));
		names.add(new Names("don", "robin", 32));
		names.add(new Names("don", "robinson", 32));
		names.add(new Names("don", "greek", 32));
	
		System.out.println(names.stream()
				.collect(Collectors
						.groupingBy((Names nm) 
								-> nm.getFirstname().equals("don"))
						));
	}
}
