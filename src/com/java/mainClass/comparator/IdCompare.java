package com.java.mainClass.comparator;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class IdCompare implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		return (e1.getId()== e2.getId())?0:(e1.getId()<e2.getId())?-1:1;
	}
	
	public List<Employee> getEmployees() {
		List<Employee> list = EmployeeDatabase.getAllStudents();
		Collections.sort(list, new IdCompare());
		return list;
	}

}
