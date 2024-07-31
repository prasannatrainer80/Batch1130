package com.java.spr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProg {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/java/spr/Fb.xml");
		Feedback fb1 = (Feedback)ctx.getBean("beanVeni");
		Feedback fb2 = (Feedback)ctx.getBean("beanSudharshan");
		Feedback fb3 = (Feedback)ctx.getBean("beanSiva");
		
		System.out.println(fb1.fbInfo());
		System.out.println(fb2.fbInfo());
		System.out.println(fb3.fbInfo());
	}
}
