package com.java.mainClass.comparable;

import java.util.List;

public class Student implements Comparable<Student>{
	private int id;
	private String name;
	private String email;
	private List<String> mobile;
	public Student(int id, String name, String email, List<String> list) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.mobile = list;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<String> getMobile() {
		return mobile;
	}
	public void setMobile(List<String> mobile) {
		this.mobile = mobile;
	}
	
	//Comparable<Student> comparable = student -> (id == student.id)? 0 : (id < student.id)? -1 : 1;
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", mobile=" + mobile + "]";
	}
	
	@Override
	public int compareTo(Student student) {
		return StudentDatabase
				.getStudentDatabase()
				.getAlgoType()
				.equalsIgnoreCase("id")?((id == student.id)? 0 : (id < student.id)? -1 : 1):(name.compareToIgnoreCase(student.getName()));
	}

}
