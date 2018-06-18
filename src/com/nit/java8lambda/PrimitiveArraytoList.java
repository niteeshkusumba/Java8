package com.nit.java8lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrimitiveArraytoList {

	public static void main(String[] args) {
		int[] num = {1,2,3,4,5,6,7,8};
		
		List<Integer> list = Arrays.stream(num).boxed().collect(Collectors.toList());
		System.out.println(list);
	}
}