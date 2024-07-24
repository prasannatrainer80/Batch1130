package com.java.hib;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class ShowInfo {

	public static void main(String[] args) {
		SessionFactory sf = SessionHelper.getSession();
		Session session = sf.openSession();
		Query query = session.createQuery("from Question");
		List<Question> questions = query.list();
		for (Question question : questions) {
			System.out.println("Question Name  " +question.getQname());
			Query query2 = session.createQuery("from Answer where qid="+question.getId());
			List<Answer> answers = query2.list();
			for(Answer ans : answers) {
				System.out.println("Answer Name  " +ans.getAnswerName());
				System.out.println("Posted By  "+ans.getPostedBy());
				System.out.println("-----------------------------------");
			}
		}
	}
}
