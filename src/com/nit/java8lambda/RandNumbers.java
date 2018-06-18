package com.nit.java8lambda;

import java.util.Random;

public class RandNumbers {

	public static void main(String[] args) {
		
		for(int i=0; i<10; i++) {
			System.out.println(getRandNums(15, 20));
		}
	}
	public static int getRandNums(int min, int max) {
		Random r=new Random();
		return r.ints(min, (max+1)).limit(1).findFirst().getAsInt();
	}
}
