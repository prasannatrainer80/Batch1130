package com.java.lms;

import java.sql.SQLException;
import java.util.Scanner;

public class ApproveDenyMain {

	public static void main(String[] args) {
		int leaveId, managerId;
		String status, managerComments;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Leave Id  ");
		leaveId = sc.nextInt();
		System.out.println("Enter Manager Id  ");
		managerId = sc.nextInt();
		System.out.println("Enter Status (YES/NO)  ");
		status = sc.next();
		System.out.println("Enter Manager Comments   ");
		managerComments = sc.next();
		LeaveDetailsDao dao = new LeaveDetailsDaoImpl();
		try {
			System.out.println(dao.approveDeny(leaveId, managerId, status, managerComments));
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
