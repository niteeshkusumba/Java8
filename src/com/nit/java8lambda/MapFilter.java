package com.nit.java8lambda;

import java.util.ArrayList;

public class MapFilter {

	public static void main(String[] args) {
		ArrayList<Names> names=new ArrayList<Names>();
		names.add(new Names("niteesh", "kusumba", 24));
		names.add(new Names("manish", "bharadwaj", 27));
		names.add(new Names("don", "robin", 32));
		
		names.stream().filter(name -> name.getFirstname().equals("niteesh"))
		.map((Names name)-> "fnmae: "+ name.getFirstname() +" - lname: " + name.getLastname())
		.forEach(name -> System.out.println(name));
		
	}
}
