package com.java.mainClass.sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

import com.java.collections.model.Employee;

public class TreeMapSorting {
	
	private static Map<Employee, Integer> map = new TreeMap<Employee, Integer>(Comparator.comparing(Employee::getEmail));
	
	public void getTreemapSortingUsingReference() {
		map.put(new Employee(22, "pupu", "abc@gmail.com", Arrays.asList("1212","2323")), 9);
		map.put(new Employee(22, "xyz", "xyz@gmail.com", Arrays.asList("12212","23523")), 9);
		map.put(new Employee(22, "samar", "samar@gmail.com", Arrays.asList("11212","12323")), 9);
		map.put(new Employee(22, "rashmoni", "rashmoni@gmail.com", Arrays.asList("121452","2325663")), 9);
		
		System.out.println("Tree map sorting: "+map);
	}

}
