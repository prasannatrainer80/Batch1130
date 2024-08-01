package com.java.spr;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UpdateEmployMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employ employ = new Employ();
		System.out.println("Enter Employ No  ");
		employ.setEmpno(sc.nextInt());
		System.out.println("Enter Employ Name  ");
		employ.setName(sc.next());
		System.out.println("Enter Gender  ");
		employ.setGender(sc.next());
		System.out.println("Enter Department   ");
		employ.setDept(sc.next());
		System.out.println("Enter Designation  ");
		employ.setDesig(sc.next());
		System.out.println("Enter Basic   ");
		employ.setBasic(sc.nextDouble());
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/java/spr/jdbc.xml");
		EmployDao dao = (EmployDao)ctx.getBean("employJdbc");
		System.out.println(dao.updateEmploy(employ));
	}
}
