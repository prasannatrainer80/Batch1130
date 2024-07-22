package com.java.hib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class MainProg {

	public static void main(String[] args) {
		SessionFactory sf = SessionHelper.getSession();
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();
		
		Employ employ1 = new Employ();
		employ1.setName("Siva Kumar Yadav");
		employ1.setEmail("shivayadav@gmail.com");
		
		Address address1 = new Address();
		address1.setAddress1("TRT 81");
		address1.setAddress2("Near Seethaphal Mandri");
		address1.setCity("Hyderabad");
		address1.setState("TS");
		address1.setZipcode("5995234");
		address1.setCountry("India");
		
		employ1.setAddress(address1);
		address1.setEmploy(employ1);
		
		Employ employ2 = new Employ();
		employ2.setName("Prathyusha");
		employ2.setEmail("prathyusha@gmail.com");
		
		Address address2 = new Address();
		address2.setAddress1("Near Bridge Road");
		address2.setAddress2("Gandhi Nagar");
		address2.setCity("Chennai");
		address2.setState("TN");
		address2.setZipcode("500323");
		address2.setCountry("India");
		
		employ2.setAddress(address2);
		address2.setEmploy(employ2);
		
		session.save(employ1);
		session.save(employ2);
		
		trans.commit();
		session.close();
		System.out.println("Tables created with New Database...");
	}
}
