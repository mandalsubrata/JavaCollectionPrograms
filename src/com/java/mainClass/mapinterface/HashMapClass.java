package com.java.mainClass.mapinterface;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class HashMapClass {

	Map<String, Integer> map = new HashMap<String, Integer>();
	public void setMap() {
		map.put("subrata", 51);
		map.put("Mandal", 66);
		map.put("Pupu", 3);
		map.put("Susmita", 433);
		
		System.out.println(">map: "+map);
		map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);
		
	}
}
