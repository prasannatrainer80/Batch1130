package com.java.hib;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class EmployDaoImpl implements EmployDao {

	SessionFactory sessionFactory;
	Session session;
	
	@Override
	public List<Employ> showEmployDao() {
		sessionFactory = SessionHelper.getSession();
		session = sessionFactory.openSession();
		Criteria cr = session.createCriteria(Employ.class);
		return cr.list();
	}

	@Override
	public List<Employ> showEmployDaoByName() {
		sessionFactory = SessionHelper.getSession();
		session = sessionFactory.openSession();
		Criteria cr = session.createCriteria(Employ.class).addOrder(Order.asc("dept")).addOrder(Order.asc("name"));
		
//	//	cr.addOrder(Order.asc("dept"));
//		cr.addOrder(Order.asc("name"));
		return cr.list();
	}

	@Override
	public List<Employ> showEmployDaoByBasicDesc() {
		sessionFactory = SessionHelper.getSession();
		session = sessionFactory.openSession();
		Criteria cr = session.createCriteria(Employ.class);
		cr.addOrder(Order.desc("basic"));
		return cr.list();
	}

	@Override
	public Employ searchByEmpno(int empno) {
		sessionFactory = SessionHelper.getSession();
		session = sessionFactory.openSession();
		Criteria cr = session.createCriteria(Employ.class);
		cr.add(Restrictions.eq("empno", empno));
		Employ employ = (Employ)cr.uniqueResult();
		return employ;
	}

	@Override
	public List<Employ> showByDept(String dept) {
		sessionFactory = SessionHelper.getSession();
		session = sessionFactory.openSession();
		Criteria cr = session.createCriteria(Employ.class);
		cr.add(Restrictions.eq("dept", dept));
		return cr.list();
	}

	@Override
	public List<Employ> showEmployByFilter(String filter) {
		sessionFactory = SessionHelper.getSession();
		session = sessionFactory.openSession();
		String fw = filter+"%";
		Criteria cr = session.createCriteria(Employ.class);
		cr.add(Restrictions.like("name", fw));
		return cr.list();
	}

	@Override
	public List<Employ> showBetweenRange() {
		sessionFactory = SessionHelper.getSession();
		session = sessionFactory.openSession();
		Criteria cr = session.createCriteria(Employ.class);
		cr.add(Restrictions.between("basic", 80000.00, 95000.00));
		System.out.println("Range " +cr);
		return cr.list();
	}

	@Override
	public List<Employ> showMultipleConditions() {
		sessionFactory = SessionHelper.getSession();
		session = sessionFactory.openSession();
		Criteria cr = session.createCriteria(Employ.class);
		Criterion cr1 = Restrictions.gt("basic", 95000.00);
		Criterion cr2 = Restrictions.eqOrIsNull("dept", "java");
		LogicalExpression expr = Restrictions.or(cr1, cr2);
		cr.add(expr);
		return cr.list();
	}

	@Override
	public List<Employ> showMultipleAnd() {
		sessionFactory = SessionHelper.getSession();
		session = sessionFactory.openSession();
		Criteria cr = session.createCriteria(Employ.class);
		Criterion cr1 = Restrictions.gt("basic", 95000.00);
		Criterion cr2 = Restrictions.eqOrIsNull("dept", "java");
		LogicalExpression expr = Restrictions.and(cr1, cr2);
		cr.add(expr);
		return cr.list();
	}

}
