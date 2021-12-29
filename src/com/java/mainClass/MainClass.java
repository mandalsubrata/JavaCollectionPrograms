package com.java.mainClass;

import java.util.Arrays;
import java.util.Date;

import com.java.collections.comparable.SortStudentBasedOnID;
import com.java.collections.comparable.SortStudentBasedOnName;
import com.java.collections.comparator.IdCompare;
import com.java.collections.comparator.IfIdSameSortByNameCompare;
import com.java.collections.comparator.NameCompare;
import com.java.mainClass.immutable.Address;
import com.java.mainClass.immutable.ImmutableClass;
import com.java.mainClass.mapinterface.HashMapClass;
import com.java.mainClass.sorting.ListSorting;
import com.java.mainClass.sorting.TreeMapSorting;
import com.java.mainClass.sorting.HashMapSorting;
import com.java.mainClass.stream.StreamClass;

public class MainClass {

	public static void main(String[] args) {

		System.out.println("Main class");
		MainClass mainClass = new MainClass();
		mainClass.handlingImmutableClass();
		mainClass.handlingSorting();
		mainClass.handleStreamClass();

		HashMapClass hashMapClass = new HashMapClass();
		hashMapClass.setMap();

		mainClass.handlingMapSorting();

		mainClass.handlingListSorting();
	}

	public void handlingListSorting() {
		ListSorting listSorting = new ListSorting();
		listSorting.primitiveSort();
		listSorting.objectListSort();
	}

	public void handlingMapSorting() {
		HashMapSorting mapSorting = new HashMapSorting();
		mapSorting.sortByPremitiveData();
		mapSorting.sortByObjectKeyName();
		mapSorting.sortByObjectKeyEmail();
		mapSorting.sortByObjectKeyEmailReverse();

		TreeMapSorting sorting = new TreeMapSorting();
		sorting.getTreemapSortingUsingReference();
	}

	public void handlingSorting() {
		SortStudentBasedOnName compareByName = new SortStudentBasedOnName();
		compareByName.getStudentsBasedName();

		SortStudentBasedOnID compare = new SortStudentBasedOnID();
		compare.getStudentsBasedOnId();

		NameCompare compareName = new NameCompare();
		System.out.println("Comparator by Name: "+ compareName.getEmployees());

		IdCompare compareId = new IdCompare();
		System.out.println("Comparator by Id: "+ compareId.getEmployees());

		IfIdSameSortByNameCompare ifIdSameSortByNameCompare = new IfIdSameSortByNameCompare();
		System.out.println("Comparator by same Id but different name: "+ ifIdSameSortByNameCompare.getEmployees());
	}

	public void handlingImmutableClass() {
		Address address = new Address("Bangalore", Arrays.asList("9482972610","234204"));
		ImmutableClass immutableClass = new ImmutableClass(1, 
				new Date(), "Subrata", address, Arrays.asList("Learning new technologies","Travelling"));
		System.out.println("ImmutableClass: "+immutableClass);
		//As ImmutableClass is a immutable class below operation(any modification on data member) can not be done.

		System.out.println("Before ImmutableClass address: "+immutableClass.getAddress().getAddr());
		immutableClass.getAddress().setAddr("Kolkata"); //We can not modify
		System.out.println("After ImmutableClass address: "+immutableClass.getAddress().getAddr());

		System.out.println("Before ImmutableClass DOB: "+immutableClass.getDob());
		immutableClass.getDob().setDate(15);
		System.out.println("After ImmutableClass DOB: "+immutableClass.getDob());

		System.out.println("Before ImmutableClass Hobbies: "+immutableClass.getHobbies());
		immutableClass.getHobbies().add("Listening to Music");
		System.out.println("After ImmutableClass Hobbies: "+immutableClass.getHobbies());
	}


	public void handleStreamClass() {
		StreamClass streamClass = new StreamClass();
		streamClass.getEmployeeMobilesMap();
		streamClass.getEmployeeMobilesFlatMap();
	}
}
