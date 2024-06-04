package com.java.lms;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class PendingLeavesMain {

	public static void main(String[] args) {
		int empId;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employ Id   ");
		empId = sc.nextInt();
		LeaveDetailsDao dao = new LeaveDetailsDaoImpl();
		try {
			List<LeaveDetails> leaveDetails = dao.showPendingLeaves(empId);
			for (LeaveDetails ld : leaveDetails) {
				System.out.println(ld);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
