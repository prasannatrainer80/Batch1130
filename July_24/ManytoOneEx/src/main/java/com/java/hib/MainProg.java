package com.java.hib;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class MainProg {

	public static void main(String[] args) {
		SessionFactory sf = SessionHelper.getSession();
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();
		
		Question question1 = new Question();
		question1.setQname("What is OOPS ");
		
		Question question2 = new Question();
		question2.setQname("What is Collections");
		
		Answer ans1 = new Answer();
		ans1.setAnswerName("It is Generalized programming design...");
		ans1.setPostedBy("Ramesh");
		
		Answer ans2 = new Answer();
		ans2.setAnswerName("It Contains Encapsulation, Abstraction, Inheritance and Polymorphism");
		ans2.setPostedBy("Siva Yadav");
		
		Answer ans3 = new Answer();
		ans3.setAnswerName("Its new Paradiagm for Programming Design...I am Expert in that");
		ans3.setPostedBy("Siva");

		Answer ans4 = new Answer();
		ans4.setAnswerName("Collections can grow to any size unlike arrays...");
		ans4.setPostedBy("Venkata Rao");
		
		Answer ans5 = new Answer();
		ans5.setAnswerName("Collections without generics inadequate");
		ans5.setPostedBy("Yegna and Jogesh");

		List<Answer> list1 = new ArrayList<Answer>();
		list1.add(ans1);
		list1.add(ans2);
		list1.add(ans3);
		
		List<Answer> list2 = new ArrayList<Answer>();
		list2.add(ans4);
		list2.add(ans5);
		
		question1.setAnswers(list1);
		question2.setAnswers(list2);
//		
		session.save(question1);
		session.save(question2);
		trans.commit();
		System.out.println("Table(s) Created with Data...");
	}
}
