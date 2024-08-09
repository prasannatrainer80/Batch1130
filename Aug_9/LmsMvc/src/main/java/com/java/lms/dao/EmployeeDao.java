package com.java.lms.dao;

import java.util.List;

import com.java.lms.model.Employee;

public interface EmployeeDao {

	List<Employee> showEmployeeDao();
	Employee searchEmployeeDao(int empId);
}
