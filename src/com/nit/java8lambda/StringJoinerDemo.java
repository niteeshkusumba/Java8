package com.nit.java8lambda;

import java.util.StringJoiner;

public class StringJoinerDemo {

	public static void main(String args[]) {
		StringJoiner str = new StringJoiner(",");
		str.add("niteesh");
		str.add("kusumba");
		
		System.out.println(str);
		
		StringJoiner str1 = new StringJoiner(",","{","}");
		str1.add("manish");
		str1.add("bharadwaj");
		
		StringJoiner str2 = new StringJoiner("-","{","}");
		str2.add("don");
		str2.add("ronson");
		
		StringJoiner merge = str1.merge(str2);
		System.out.println(merge);
		System.out.println(merge.length());
		
		StringJoiner str3 = new StringJoiner(":");
		str3.setEmptyValue("empty");
		System.out.println(str3);
		
		String strn = str2.toString();
		System.out.println(strn);
	}
}
