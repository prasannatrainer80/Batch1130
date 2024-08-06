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
		List<String> names = new ArrayList<String>();
		names.add("Chakravarthy");
		names.add("Ramesh");
		names.add("Jogeshwar");
		names.add("Shiva");
		names.add("Radha");
		names.add("Jyoshna");
		names.add("Rajendra");
		return new ModelAndView("home","names",names);
	}
}
