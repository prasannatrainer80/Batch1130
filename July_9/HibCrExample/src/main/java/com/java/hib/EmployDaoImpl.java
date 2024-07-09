package com.java.hib;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
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

	@Override
	public List<String> showDepts() {
		sessionFactory = SessionHelper.getSession();
		session = sessionFactory.openSession();
		Criteria cr = session.createCriteria(Employ.class).
				setProjection(Projections.distinct(Projections.property("dept")));
		return cr.list();
	}

	@Override
	public List<Employ> showByDeptName(String dept) {
		sessionFactory = SessionHelper.getSession();
		session = sessionFactory.openSession();
		Criteria cr = session.createCriteria(Employ.class);
		cr.add(Restrictions.eq("dept", dept));
		return cr.list();
	}

	@Override
	public List<String> showGender() {
		sessionFactory = SessionHelper.getSession();
		session = sessionFactory.openSession();
		Criteria cr = session.createCriteria(Employ.class).
				setProjection(Projections.distinct(Projections.property("gender")));
		return cr.list();
	}

	@Override
	public List<Employ> showByGender(String gen) {
		sessionFactory = SessionHelper.getSession();
		session = sessionFactory.openSession();
		Criteria cr = session.createCriteria(Employ.class);
		cr.add(Restrictions.eq("gender", gen));
		return cr.list();
	}
	
	public long rowCount() {
		sessionFactory = SessionHelper.getSession();
		session = sessionFactory.openSession();
		Criteria cr = session.createCriteria(Employ.class);
		cr.setProjection(Projections.rowCount());
		long count = (Long)cr.uniqueResult();
		return count;
	}

	@Override
	public long authenticate(String user, String pwd) {
		String passCode = EncryptPassword.getCode(pwd);
		System.out.println("Program Code " +passCode);
		sessionFactory = SessionHelper.getSession();
		session = sessionFactory.openSession();
		Criteria cr = session.createCriteria(Users.class);
		cr.add(Restrictions.eq("userName", user));
		cr.add(Restrictions.eq("passCode", passCode));
		cr.setProjection(Projections.rowCount());
		System.out.println("Total Records " +cr.uniqueResult());
		long count = (Long)cr.uniqueResult();
		return count;
	}

	@Override
	public int validate(String user, String pwd) {
		String passCode = EncryptPassword.getCode(pwd);
		System.out.println("Program Code " +passCode);
		sessionFactory = SessionHelper.getSession();
		session = sessionFactory.openSession();
		Criteria cr = session.createCriteria(Users.class);
		cr.add(Restrictions.eq("userName", user));
		cr.add(Restrictions.eq("passCode", passCode));
		Users users = (Users)cr.uniqueResult();
		if (users!=null) {
			return 1;
		}
		return 0;
	}

}
