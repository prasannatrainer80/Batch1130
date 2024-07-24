package com.java.hib;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class AddData {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SessionFactory sf = SessionHelper.getSession();
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();
		
		Question question = new Question();
		System.out.println("Enter Question   ");
		question.setQname(sc.nextLine());
		
		String choice ="YES";
		List<Answer> answers = new ArrayList<Answer>();
		do {
			Answer ans = new Answer();
			System.out.println("Enter Your Answer  ");
			ans.setAnswerName(sc.nextLine());
			System.out.println("Enter Who Posted this Answer...");
			ans.setPostedBy(sc.nextLine());
			answers.add(ans);
			System.out.println("Wish to Continue (Yes/NO)  ");
			choice = sc.nextLine();
		} while(choice.equals("YES"));
		
		question.setAnswers(answers);
		session.save(question);
		trans.commit();
		System.out.println("New Question Added with Multiple Answers...");
	}
}
