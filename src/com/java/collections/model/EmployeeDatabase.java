package com.java.collections.model;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeDatabase {
	
	public static List<Employee> getAllEmployees(){
		return Stream.of(
				new Employee(11,"Subrata Mandal","subratamandal294@gmail.com",Arrays.asList("545435345","243355")),
				new Employee(100,"Susmita Mandal","susmitamandal294@gmail.com",Arrays.asList("9882972624","32342342")),
				new Employee(50,"Swarnadeep Mandal","swarnadeepmandal294@gmail.com",Arrays.asList("54353242","3452566")),
				new Employee(13,"Samar Mandal","samarmandal294@gmail.com",Arrays.asList("994737443","2375884784")),
				new Employee(61,"Swadesh Mandal","swadeshmandal294@gmail.com",Arrays.asList("9484748578","3975849378")),
				new Employee(144,"Rashmoni Mandal","rashmonimandal294@gmail.com",Arrays.asList("384985958","788347834873")),
				new Employee(11,"Shubhradeep Mandal","subratamandal294@gmail.com",Arrays.asList("545435345","243355"))
				).collect(Collectors.toList());
	}

}
