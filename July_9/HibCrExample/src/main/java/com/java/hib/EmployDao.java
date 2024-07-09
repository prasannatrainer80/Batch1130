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
	List<String> showDepts();
	List<Employ> showByDeptName(String dept);
	List<String> showGender();
	List<Employ> showByGender(String gen);
	long authenticate(String user, String pwd);
	int validate(String user, String pwd);
	
}
