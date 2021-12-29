package com.java.collections.comparable;

import java.util.Collections;
import java.util.List;

public class SortStudentBasedOnID{

	
	public void getStudentsBasedOnId() {
		StudentDatabase database = StudentDatabase.getStudentDatabase();
		database.setAlgoType("id");
		List<Student> listOfStudents = database.getAllStudents();
		Collections.sort(listOfStudents);
		//Sorting base on ID
		System.out.println("List of students short by ID (one to one mapping): "+listOfStudents);
	}

	
}
