package com.nit.java8lambda;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class DateZoneldandUTC {

	 public static void main(String[] argv) {

	        Map<String, String> sortedMap = new LinkedHashMap<>();

	        List<String> zoneList = new ArrayList<>(ZoneId.getAvailableZoneIds());

	        Map<String, String> allZoneIds = getAllZoneIds(zoneList);

	        allZoneIds.entrySet().stream()
	                .sorted(Map.Entry.<String, String>comparingByValue().reversed())
	                .forEachOrdered(e -> sortedMap.put(e.getKey(), e.getValue()));
	        
	        sortedMap.forEach((k, v) ->
	        {
	            String out = String.format("%35s (UTC%s) %n", k, v);
	            System.out.printf(out);
	        });

			System.out.println("\nTotal Zone IDs " + sortedMap.size());

	    }

	    private static Map<String, String> getAllZoneIds(List<String> zoneList) {

	        Map<String, String> result = new HashMap<>();

	        LocalDateTime dt = LocalDateTime.now();

	        for (String zoneId : zoneList) {

	            ZoneId zone = ZoneId.of(zoneId);
	            ZonedDateTime zdt = dt.atZone(zone);
	            ZoneOffset zos = zdt.getOffset();

	            String offset = zos.getId().replaceAll("Z", "+00:00");

	            result.put(zone.toString(), offset);

	        }

	        return result;
	    }
}