package com.nit.java8lambda;

import java.util.ArrayList;

public class ForEachDemo {

	public static void main(String[] args) {
		ArrayList<Names> names=new ArrayList<Names>();
		names.add(new Names("niteesh", "kusumba", 24));
		names.add(new Names("manish", "bharadwaj", 27));
		names.add(new Names("don", "robin", 32));
		
		/*for(Names i:names)
		{
			System.out.println(i);
		}*/
		
		names.forEach(i -> System.out.println(i));
	}
}
