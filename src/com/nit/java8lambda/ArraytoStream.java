package com.nit.java8lambda;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArraytoStream {
	public static void main(String[] args) {
		String[] array= {"a","b","c","d","e"};
		
		System.out.println("using arrays.stream");
		Stream<String> strm=Arrays.stream(array);
		strm.forEach(x -> System.out.println(x));
		
		System.out.println("using stream.of");
		Stream<String> strm1=Stream.of(array);
		strm1.forEach(x -> System.out.println(x));
	}

}
