package com.java.lms;

import java.sql.SQLException;
import java.util.Scanner;

public class EmployeeSearchMain {

	public static void main(String[] args) {
		int empId;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employ Id  ");
		empId = sc.nextInt();
		EmployeeDao dao = new EmployeeDaoImpl();
		try {
			Employee employee = dao.searchEmployee(empId);
			if (employee !=null) {
				System.out.println(employee);
			} else {
				System.out.println("*** Record Not Found ***");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
