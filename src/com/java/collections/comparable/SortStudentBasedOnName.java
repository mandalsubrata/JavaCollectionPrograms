package com.java.collections.comparable;

import java.util.Collections;
import java.util.List;

public class SortStudentBasedOnName{

	
	public void getStudentsBasedName() {
		StudentDatabase database = StudentDatabase.getStudentDatabase();
		database.setAlgoType("name");
		List<Student> listOfStudents = database.getAllStudents();
		Collections.sort(listOfStudents);
		//Sorting base on ID
		System.out.println("List of students sort by Name (one to one mapping): "+listOfStudents);
	}

}
