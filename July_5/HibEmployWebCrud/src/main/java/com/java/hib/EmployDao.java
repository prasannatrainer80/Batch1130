package com.java.hib;

import java.util.List;

public interface EmployDao {
	List<Employ> showEmployDao();
	Employ searchEmployDao(int empno);
	String updateEmployDao(Employ employUpdated);
	String deleteEmployDao(int empno);
	String addEmployDao(Employ employNew);
}
