package com.java.lms;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class ApplyLeaveMain {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		LeaveDetails leaveDetails = new LeaveDetails();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employ Id  ");
		leaveDetails.setEmpId(sc.nextInt());
		System.out.println("Leave Start-Date  ");
		java.util.Date d1 = sdf.parse(sc.next());
		leaveDetails.setLeaveStartDate(new java.sql.Date(d1.getTime()));
		System.out.println("Leave End-Date  ");
		java.util.Date d2 = sdf.parse(sc.next());
		leaveDetails.setLeaveEndDate(new java.sql.Date(d2.getTime()));
		System.out.println("Enter Leave TYpe (EL/PL/ML) ");
		leaveDetails.setLeaveType(sc.next());
		System.out.println("Enter Leave Reason  ");
		leaveDetails.setLeaveReason(sc.next());
		LeaveDetailsDao dao = new LeaveDetailsDaoImpl();
		try {
			System.out.println(dao.applyLeaveDao(leaveDetails));
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
