package com.nit.java8lambda;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StringtoLocalDate {

	public static void main(String[] argv) {

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d-MMM-yyyy");
        
		String date = "16-Aug-2016";

        LocalDate localDate = LocalDate.parse(date, formatter);
 
        System.out.println(localDate);

        System.out.println(formatter.format(localDate));
    }
}
