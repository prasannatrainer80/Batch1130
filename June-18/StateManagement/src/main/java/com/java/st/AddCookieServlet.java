package com.java.st;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddCookieServlet
 */
public class AddCookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddCookieServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		Cookie ckRaj = new Cookie("Rajendra", "84");
		ckRaj.setMaxAge(1000 * 60 * 60 * 24);
		response.addCookie(ckRaj);
		
		Cookie ckRam = new Cookie("Ramesh", "91");
		ckRaj.setMaxAge(1000 * 60 * 60 * 24);
		response.addCookie(ckRam);
		
		Cookie ckJogi = new Cookie("Jogesh", "98");
		ckRaj.setMaxAge(1000 * 60 * 60 * 24);
		response.addCookie(ckJogi);
		
		Cookie ckVeni = new Cookie("KrishnaVeni", "81");
		ckRaj.setMaxAge(1000 * 60 * 60 * 24);
		response.addCookie(ckVeni);
		
		Cookie ckSatya = new Cookie("Satya", "89");
		ckRaj.setMaxAge(1000 * 60 * 60 * 24);
		response.addCookie(ckSatya);
		
		out.println("Cookies are Created Successfully...");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
