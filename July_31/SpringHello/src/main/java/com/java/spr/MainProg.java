package com.java.spr;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProg {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/java/spr/Joining.xml");
		Joining joining=null;;
		Date date = new Date();
		int hr = date.getHours();
		System.out.println(hr);
		if (hr >= 9 && hr <= 12) {
			joining = (Joining)ctx.getBean("beanMorning");
		} else if (hr > 12 && hr <= 16) {
			joining = (Joining)ctx.getBean("beanAfternoon");
		} else if (hr > 16) {
			joining = (Joining)ctx.getBean("beanEvening");
		}
		joining.show("Akhil Kumar");
	}
}
