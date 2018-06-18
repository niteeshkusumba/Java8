package com.nit.java8lambda;

import java.util.Optional;
import java.util.function.Function;

public class OptionalinDepth {

	public static void main(String args[]) {
		Function<String, String> getword2 = (String s) ->
				{return s.split(" ").length>1 ? s.split(" ")[1] : null;};
		
		Function<String, Integer> count = t -> t.length();
		
		Optional<String> opt=Optional.ofNullable(getword2.apply("niteesh"));
		opt.ifPresent(System.out::println);
		opt.map(count).ifPresent(System.out::println);
	}
}
