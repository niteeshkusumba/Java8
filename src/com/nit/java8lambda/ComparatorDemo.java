package com.nit.java8lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorDemo {
	public static void main(String[] args) {
		ArrayList<Names> names=new ArrayList<Names>();
		names.add(new Names("niteesh", "kusumba", 24));
		names.add(new Names("manish", "bharadwaj", 27));
		names.add(new Names("don", "robin", 32));
		
		ArrayList<Names> names2= (ArrayList<Names>) names.clone();
		

		Comparator<Names> comp= (Names n1, Names n2) -> n1.lastname.compareTo(n2.lastname);
		Collections.sort(names2, comp);
		System.out.println(names2);		
	}
}
