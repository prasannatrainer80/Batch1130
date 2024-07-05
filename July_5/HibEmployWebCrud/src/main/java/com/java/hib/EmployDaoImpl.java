package com.java.hib;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class EmployDaoImpl implements EmployDao {

	SessionFactory sessionFactory;
	Session session;
	
	@Override
	public List<Employ> showEmployDao() {
		sessionFactory = SessionHelper.getSession();
		session = sessionFactory.openSession();
		Query query = session.createQuery("from Employ");
		List<Employ> employList = query.list();
		return employList;
	}

	@Override
	public Employ searchEmployDao(int empno) {
		sessionFactory = SessionHelper.getSession();
		session = sessionFactory.openSession();
		Query query = session.createQuery("from Employ where empno = " +empno);
		Employ employ = (Employ)query.uniqueResult();
		return employ;
	}

	@Override
	public String updateEmployDao(Employ employUpdated) {
		sessionFactory = SessionHelper.getSession();
		session = sessionFactory.openSession();
		Transaction trans = session.beginTransaction();
		session.saveOrUpdate(employUpdated);
		trans.commit();
		return "Employ Record Updated...";
	}

	@Override
	public String deleteEmployDao(int empno) {
		Employ employ = searchEmployDao(empno);
		sessionFactory = SessionHelper.getSession();
		session = sessionFactory.openSession();
		Transaction trans = session.beginTransaction();
		session.delete(employ);
		trans.commit();
		return "Employ Record Deleted...";
	}

	@Override
	public String addEmployDao(Employ employNew) {
		sessionFactory = SessionHelper.getSession();
		session = sessionFactory.openSession();
		Transaction trans = session.beginTransaction();
		session.save(employNew);
		trans.commit();
		return "Employ Record Inserted...";
	}
	

}
