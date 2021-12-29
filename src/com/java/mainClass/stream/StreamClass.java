package com.java.mainClass.stream;

import java.util.List;
import java.util.stream.Collectors;

import com.java.collections.model.Employee;
import com.java.collections.model.EmployeeDatabase;

public class StreamClass {

	//Output : contains stream of streams
	//Map: [[545435345, 243355], [9882972624, 32342342], [54353242, 3452566], [994737443, 2375884784], [9484748578, 3975849378], [384985958, 788347834873], [545435345, 243355]]
	public void getEmployeeMobilesMap() {
		List<Employee> employees = EmployeeDatabase.getAllEmployees();
		//See here if we use map we will get mobile as List<List<String>>
		List<List<String>> mobiles = employees.stream().map(employee->employee.getMobile()).collect(Collectors.toList());
		System.out.println("Map: "+mobiles);
	}
	
	//Output: Contains one stream
	//FlatMap [545435345, 243355, 9882972624, 32342342, 54353242, 3452566, 994737443, 2375884784, 9484748578, 3975849378, 384985958, 788347834873, 545435345, 243355]
	public void getEmployeeMobilesFlatMap() {
		List<Employee> employees = EmployeeDatabase.getAllEmployees();
		List<String> mobiles = employees.stream().flatMap(employee->employee.getMobile().stream()).collect(Collectors.toList());
		System.out.println("FlatMap "+mobiles);
	}
	
	
			

}
