package com.java.nq;

import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class EmploySearchMain {
	public static void main(String[] args) {
		int empno;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employ No   ");
		empno = sc.nextInt();
		SessionFactory sf = SessionHelper.getSession();
		Session session = sf.openSession();
		Query query = session.getNamedQuery("searchEmploy");
		query.setParameter("empno", empno);
		Employ employ = (Employ)query.uniqueResult();
		if (employ!=null) {
			System.out.println(employ);
		} else {
			System.out.println("*** Record Not Found ***");
		}
	}
}
