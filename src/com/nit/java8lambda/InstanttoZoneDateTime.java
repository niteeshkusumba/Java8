package com.nit.java8lambda;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class InstanttoZoneDateTime {

	public static void main(String[] args) {
		 Instant instant = Instant.now();

	     System.out.println("Instant : " + instant);

	     ZonedDateTime jpTime = instant.atZone(ZoneId.of("Asia/Tokyo"));

	        System.out.println("ZonedDateTime : " + jpTime);

	        System.out.println("OffSet : " + jpTime.getOffset());

	}

}
