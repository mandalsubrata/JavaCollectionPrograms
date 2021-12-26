package com.java.mainClass.immutable;

import java.util.Arrays;
import java.util.List;

//Mutable class
public class Address {
	public String addr = "";
	public List<String> mobile = Arrays.asList("123","11");
	
	public Address(String addr, List<String> mobile) {
		this.addr = addr;
		this.mobile = mobile;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public List<String> getMobile() {
		return mobile;
	}
	public void setMobile(List<String> mobile) {
		this.mobile = mobile;
	}
	

}
