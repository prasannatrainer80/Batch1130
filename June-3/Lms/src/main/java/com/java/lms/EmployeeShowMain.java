package com.java.lms;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeShowMain {

	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<Employee>();
		EmployeeDao dao = new EmployeeDaoImpl();
		try {
			employeeList = dao.showEmployee();
			for (Employee employee : employeeList) {
				System.out.println(employee);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
