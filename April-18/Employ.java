package com.java.test;

public class Employ {

	int empno;
	String name;
	double basic;

	@Override
	public boolean equals(Object obj) {
		Employ employ = (Employ)obj;
		if (employ.empno == empno && employ.name == name 
				&& employ.basic == basic
				) {
			return true;
		}
		return false;
	}
}