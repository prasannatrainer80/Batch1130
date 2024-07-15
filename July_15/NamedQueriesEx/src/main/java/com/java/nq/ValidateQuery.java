package com.java.nq;

import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class ValidateQuery {
	public static void main(String[] args) {
		String user, pwd;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter UserName  ");
		user = sc.next();
		System.out.println("Enter Passcode  ");
		pwd = sc.next();
		String encr = EncryptPassword.getCode(pwd);
		SessionFactory sf = SessionHelper.getSession();
		Session session = sf.openSession();
		Query query = session.getNamedQuery("validate");
		query.setParameter("userName", user);
		query.setParameter("passCode", encr);
		Users users = (Users)query.uniqueResult();
		if (users!=null) {
			System.out.println("Correct Credentials...");
		} else {
			System.out.println("Invalid Credentials...");
		}
	}
}
