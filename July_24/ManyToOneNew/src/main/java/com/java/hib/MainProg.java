package com.java.hib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class MainProg {

	public static void main(String[] args) {
		SessionFactory sf = SessionHelper.getSession();
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();
		
		Tutorial tutorial = new Tutorial();
		tutorial.setTitle("Java Tutorial");
		tutorial.setDescription("Java Videos from CodeRanch...");
		tutorial.setPublished(true);
		
		Comment comment1 = new Comment();
		comment1.setContent("Its Very Nice Tutorial My Friend...");
		comment1.setTutorial(tutorial);
		
		Comment comment2 = new Comment();
		comment2.setContent("Step By Step Easily You Can follow...");
		comment2.setTutorial(tutorial);
		
		Comment comment3 = new Comment();
		comment3.setContent("Testing Phase to be happen...");
		comment3.setTutorial(tutorial);
		
		session.save(tutorial);
		session.save(comment1);
		session.save(comment2);
		session.save(comment3);
		trans.commit();
		System.out.println("Data Saved");
		
	}
}
