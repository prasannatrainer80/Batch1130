package com.java.lms.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.java.lms.dao.EmployeeDaoImpl;
import com.java.lms.model.Employee;

@Controller
public class HomeController {

	@Autowired
	private EmployeeDaoImpl impl;
	
	@RequestMapping(value="/dashBoard")
	public ModelAndView showInfo(HttpServletRequest req) {
		int empId = Integer.parseInt(req.getParameter("empId"));
		Employee employee = impl.searchEmployeeDao(empId);
		int mgrId = employee.getManagerId();
		Employee manager = impl.searchEmployeeDao(mgrId);
		List<Employee> employList = new ArrayList<Employee>();
		employList.add(employee);
		employList.add(manager);
		return new ModelAndView("dashBoard","employList",employList);
	}
	
	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		
		List<Employee> employList = impl.showEmployeeDao();
		
		return new ModelAndView("home","employList",employList);
	}
}
