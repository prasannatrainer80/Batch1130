package com.java.spr;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployShowMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/java/spr/jdbc.xml");
		EmployDao dao = (EmployDao)ctx.getBean("employJdbc");
		List<Employ> employList = dao.showEmployDao();
		employList.forEach(x -> {
			System.out.println(x);
		});
	}
}
