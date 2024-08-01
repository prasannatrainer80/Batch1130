package com.java.spr;

import java.util.List;

public interface EmployDao {
	
	List<Employ> showEmployDao();
	Employ searchEmployDao(int empno);
	String addEmploy(Employ employ);
	String deleteEmploy(int empno);
	String updateEmploy(Employ employ);
}
