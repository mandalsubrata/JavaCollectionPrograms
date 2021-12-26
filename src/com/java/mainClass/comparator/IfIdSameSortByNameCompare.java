package com.java.mainClass.comparator;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class IfIdSameSortByNameCompare implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		return (e1.getId()== e2.getId())?e1.getName().compareTo(e2.getName()):(e1.getId()<e2.getId())?-1:1;
	}
	
	public List<Employee> getEmployees() {
		List<Employee> list = EmployeeDatabase.getAllStudents();
		Collections.sort(list, new IfIdSameSortByNameCompare());
		return list;
	}

}
