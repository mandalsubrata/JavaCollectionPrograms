package com.java.mainClass.immutable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author subratamandal
 * Immutable class example
 */
public final class ImmutableClass {
	private final int id;
	private final Date dob;
	private final String name;
	private final Address address;
	private final List<String> hobbies;
	//private final ClonableClass clonableClass;
	public ImmutableClass(int id, Date dob, String name, Address address, List<String> hobbies) {
		super();
		this.id = id;
		this.dob = dob;
		this.name = name;
		this.address = address;
		this.hobbies = hobbies;
		//this.clonableClass = clonableClass;
	}
	public List<String> getHobbies() {
		return new ArrayList<String>(hobbies);
		//return hobbies;
	}
	public int getId() {
		return id;
	}
	public Date getDob() {
		return (Date) dob.clone();
		//return dob;
	}
	public String getName() {
		return name;
	}
	public Address getAddress() {
		return new Address(address.getAddr(), address.getMobile());
		//return address;
	}
//	public ClonableClass getClonableClass() {
//		return (ClonableClass) clonableClass.clone();
//	}
	@Override
	public String toString() {
		return "ImmutableClass [id=" + id + ", dob=" + dob + ", name=" + name + ", address=" + address + ", hobbies="
				+ hobbies + "]";
	}

}
