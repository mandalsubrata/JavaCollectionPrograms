package com.java.collections.comparator;

import java.util.Collections;
import java.util.List;

import com.java.collections.model.Employee;
import com.java.collections.model.EmployeeDatabase;

public class IdCompare {

	public List<Employee> getEmployees() {
		List<Employee> list = EmployeeDatabase.getAllEmployees();
		Collections.sort(list, (e1,e2)->(e1.getId()== e2.getId())?0:(e1.getId()<e2.getId())?-1:1);
		return list;
	}
}
