package com.nit.java8lambda;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamOperatedupon {

	public static void main(String[] args) {
		String[] array = {"a","b","c","d","e"};
		Supplier<Stream<String>> strm= ()->Stream.of(array);
		
		strm.get().forEach(x->System.out.println(x));
		
		long count = strm.get().filter(x-> "b".equals(x)).count();
		System.out.println(count);
	}
}
