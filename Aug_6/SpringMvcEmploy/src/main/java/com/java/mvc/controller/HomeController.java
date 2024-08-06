package com.java.mvc.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		List<Employ> employList = new ArrayList<Employ>();
		employList.add(new Employ(1, "Ramesh", "MALE", "Java", "Programmer", 99234.44));
		employList.add(new Employ(2, "Krishna", "MALE", "Java", "Programmer", 99234.44));
		employList.add(new Employ(3, "Naresh", "MALE", "Java", "Programmer", 99234.44));
		employList.add(new Employ(4, "JayaSimha", "MALE", "Java", "Programmer", 99234.44));
		employList.add(new Employ(5, "Akhil", "MALE", "Java", "Programmer", 99234.44));
		employList.add(new Employ(6, "Jogesh", "MALE", "Java", "Programmer", 99234.44));
		
		return new ModelAndView("home","employList",employList);
	}
}
