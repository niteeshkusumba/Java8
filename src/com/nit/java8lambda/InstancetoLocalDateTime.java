package com.nit.java8lambda;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class InstancetoLocalDateTime {

	public static void main(String[] argv) {

        Instant instant = Instant.now();

        System.out.println("Instant : " + instant);
        
        LocalDateTime ldt = LocalDateTime.ofInstant(instant, ZoneOffset.UTC);

        System.out.println("LocalDateTime : " + ldt);

    }
}
