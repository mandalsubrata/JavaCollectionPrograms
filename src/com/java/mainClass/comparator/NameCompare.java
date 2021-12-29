package com.java.mainClass.comparator;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class NameCompare implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.getName().compareTo(e2.getName());
	}
	
	public List<Employee> getEmployees() {
		List<Employee> list = EmployeeDatabase.getAllEmployees();
		Collections.sort(list, new NameCompare());
		return list;
	}

}
