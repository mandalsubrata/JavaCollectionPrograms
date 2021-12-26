package com.java.mainClass.immutable;

public class ClonableClass implements Cloneable{
	public String qualification="10th";
	

	public ClonableClass(String qualification) {
		this.qualification = qualification;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

}
