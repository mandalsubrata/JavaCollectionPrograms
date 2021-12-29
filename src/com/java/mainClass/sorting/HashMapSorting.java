package com.java.mainClass.sorting;

import java.util.Comparator;
import java.util.Map;

import com.java.collections.model.Employee;
import com.java.collections.model.MapData;

public class HashMapSorting {
	/**
	 * Sorting map based on primitive as key
	 */
	public void sortByPremitiveData() {
		Map<String,String> map = MapData.getHashMap();
		//Ascending order
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		System.out.println("primitive data sort by key");
		//Descending order
		map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);
		
	}
	
	/**
	 * Sorting map based-field on an OBJECT as key
	 */
	public void sortByObjectKeyName() {
		System.out.println("sort by name");
		Map<Employee,Integer> map = MapData.getHashMapWithEmployeeObjAsKey();
		map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getName))).forEach(System.out::println);
	}

	public void sortByObjectKeyEmail() {
		System.out.println("sort by email");
		Map<Employee,Integer> map = MapData.getHashMapWithEmployeeObjAsKey();
		map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getEmail))).forEach(System.out::println);
	}
	
	public void sortByObjectKeyEmailReverse() {
		System.out.println("sort by email in reversed order call by reference");
		Map<Employee,Integer> map = MapData.getHashMapWithEmployeeObjAsKey();
		map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getEmail).reversed())).forEach(System.out::println);
	}
}
