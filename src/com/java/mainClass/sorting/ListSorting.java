package com.java.mainClass.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

import com.java.collections.model.Employee;
import com.java.collections.model.MapData;

public class ListSorting {
	public static List<String> primitiveList = Arrays.asList("pupu","subrata","susmita","rakesh");
	public static List<Employee> objectList =  new ArrayList<Employee>();
	public void primitiveSort() {
		System.out.println("Before default sorting: "+primitiveList);
		Collections.sort(primitiveList);
		System.out.println("After default sorting: "+primitiveList);
		Collections.reverse(primitiveList);
		System.out.println("After desending order sorting: "+primitiveList);
		System.out.println("Using stream api default sorting");
		primitiveList.stream().sorted().forEach(System.out::println);
		System.out.println("Using stream api reverse order sorting");
		primitiveList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}

	public void objectListSort() {
		objectList.add(new Employee(2, "pupai", "pupu@gmail.com",Arrays.asList("1245","3535")));
		objectList.add(new Employee(22, "susmita", "susmita@gmail.com",Arrays.asList("12145","35235")));
		objectList.add(new Employee(25, "rakesh", "rakesh@gmail.com",Arrays.asList("12425","35335")));
		objectList.add(new Employee(12, "abc", "abc@gmail.com",Arrays.asList("12445","35435")));
		
		Collections.sort(objectList, (e1,e2)->e1.getName().compareTo(e2.getName()));
		System.out.println("Custome object list sort: "+objectList);
		
		System.out.println("list lamda expression **************");
		objectList.stream().sorted((e1,e2)->e1.getName().compareTo(e2.getName())).forEach(System.out::println);
		System.out.println("list method reference based on ID **************");
		objectList.stream().sorted(Comparator.comparing(Employee::getId)).forEach(System.out::println);
		
		System.out.println("**************");
		
	//	Map<Employee,Integer> map = MapData.getHashMapWithEmployeeObjAsKey();
	//	map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getEmail).reversed())).forEach(System.out::println);
	
		
		Map<Employee,Integer> map = MapData.getHashMapWithEmployeeObjAsKey();
		map.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByKey(
				(e1,e2)->(e1.getId()>e2.getId()?1:(e1.getId()<e1.getId()?-1:0)))
				).forEach(System.out::println);
	
	}
}
