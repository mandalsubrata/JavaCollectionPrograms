package com.java.collections.interview;

import java.util.HashSet;
import java.util.Set;

public class CustomerServiceImpl {

	Set<Customer> set = new HashSet<Customer>();
	
	public static void main(String[] args) {
		CustomerServiceImpl obj = new CustomerServiceImpl();
		obj.addCustomer(new Customer("Subrata", 33));
		obj.addCustomer(new Customer("Subrat", 33));
		
		System.out.println(obj.set);
	}
	
	public void addCustomer(Customer customer) {
		set.add(customer);
	}
}
