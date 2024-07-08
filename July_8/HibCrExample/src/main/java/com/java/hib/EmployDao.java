package com.java.hib;

import java.util.List;

public interface EmployDao {

	List<Employ> showEmployDao();
	List<Employ> showEmployDaoByName();
	List<Employ> showEmployDaoByBasicDesc();
	Employ searchByEmpno(int empno);
	List<Employ> showByDept(String dept);
	List<Employ> showEmployByFilter(String filter);
	List<Employ> showBetweenRange();
	List<Employ> showMultipleConditions();
	List<Employ> showMultipleAnd();
}
