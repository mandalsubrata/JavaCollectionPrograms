package com.java.collections.comparable;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentDatabase {
	private static StudentDatabase database = null;
	private StudentDatabase() {}
	
	public static StudentDatabase getStudentDatabase() {
		if(database == null) {
			database = new StudentDatabase();
		}
		return database;
	}
	
	private String algoType ="";


	public List<Student> getAllStudents(){
		return Stream.of(
				new Student(11,"Subrata Mandal","subratamandal294@gmail.com",Arrays.asList("545435345","243355")),
				new Student(100,"Susmita Mandal","susmitamandal294@gmail.com",Arrays.asList("9882972624","32342342")),
				new Student(5,"Swarnadeep Mandal","swarnadeepmandal294@gmail.com",Arrays.asList("54353242","3452566")),
				new Student(13,"Samar Mandal","samarmandal294@gmail.com",Arrays.asList("994737443","2375884784")),
				new Student(61,"Swadesh Mandal","swadeshmandal294@gmail.com",Arrays.asList("9484748578","3975849378")),
				new Student(144,"Rashmoni Mandal","rashmonimandal294@gmail.com",Arrays.asList("384985958","788347834873"))
				).collect(Collectors.toList());
	}


	public String getAlgoType() {
		return algoType;
	}


	public void setAlgoType(String algoType) {
		this.algoType = algoType;
	}

}
