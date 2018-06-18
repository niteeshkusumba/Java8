package com.nit.java8lambda;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArraysJoinDemo {

	public static void main(String[] args) {
		String[] s1= new String[] {"nit","man","don"};
		String[] s2= new String[] {"eesh","ish","son"};
		
		String[] res=Stream.of(s1,s2).flatMap(Stream::of).toArray(String[]::new);
		System.out.println(Arrays.toString(res));	
	}
}
