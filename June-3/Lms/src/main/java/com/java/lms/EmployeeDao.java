package com.java.lms;

import java.sql.SQLException;
import java.util.List;

public interface EmployeeDao {
	
	List<Employee> showEmployee() throws ClassNotFoundException, SQLException;
	Employee searchEmployee(int empId) throws ClassNotFoundException, SQLException;
}
