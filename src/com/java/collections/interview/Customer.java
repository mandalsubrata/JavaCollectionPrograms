package com.java.collections.interview;

import java.util.Objects;

public class Customer {
	private String name;
	private int age;
	public Customer(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	

	
@Override
	public int hashCode() {
	int hash = Objects.hash(age);
	System.out.println("hashCode: "+hash);
		return hash;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("equals");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		System.out.println("equals: " +(age == other.age));
		return age == other.age;
	}
	//	@Override
//	public int hashCode() {
//		return Objects.hash(name);
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Customer other = (Customer) obj;
//		return Objects.equals(name, other.name);
//	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + "]";
	} 

//	/Capgemini/api -> add customer
//	//Post
//	
//	http://locathost:8080/Capgemini/api/v1/c
}

