package com.nit.java8lambda;

public class StringtoCharArray {

	public static void main(String args[]) {
		String str="niteesh";
		char[] chararray = str.toCharArray();
		
		for(char c : chararray) {
			System.out.println(c);
		}
	}
}
