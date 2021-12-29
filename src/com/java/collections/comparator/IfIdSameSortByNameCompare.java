package com.java.collections.comparator;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.java.collections.model.Employee;
import com.java.collections.model.EmployeeDatabase;

public class IfIdSameSortByNameCompare implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		return (e1.getId()== e2.getId())?e1.getName().compareTo(e2.getName()):(e1.getId()<e2.getId())?-1:1;
	}
	
	public List<Employee> getEmployees() {
		List<Employee> list = EmployeeDatabase.getAllEmployees();
		Collections.sort(list, new IfIdSameSortByNameCompare());
		return list;
	}

}
