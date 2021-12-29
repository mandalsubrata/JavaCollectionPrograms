package com.java.collections.model;

import java.util.Arrays;
import java.util.HashMap;

public class MapData {
	public static HashMap<String,String> getHashMap() {
		HashMap<String,String> map = new HashMap<String,String>();
		map.put("uu", "1");
		map.put("eee", "122");
		map.put("asf", "12");
		map.put("yfee", "31");
		map.put("eemdk", "221");
		return map;
	}
	public static HashMap<Employee,Integer> getHashMapWithEmployeeObjAsKey() {
		HashMap<Employee,Integer> map = new HashMap<Employee, Integer>();
		map.put(new Employee(422, "mandal", "abc@gmail.com", Arrays.asList("9348","4343")), 33);
		map.put(new Employee(22, "rakesh", "axyzc@gmail.com", Arrays.asList("239348","114343")), 53);
		map.put(new Employee(122, "pupu", "pupu@gmail.com", Arrays.asList("39348","54343")), 334);
		map.put(new Employee(2, "susmita", "ndj@gmail.com", Arrays.asList("593484","455343")), 1);
		return map;
	}
}
