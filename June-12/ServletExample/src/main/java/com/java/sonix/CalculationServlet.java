package com.java.sonix;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalculationServlet
 */
public class CalculationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalculationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		int firstNo, secondNo, result;
		firstNo = Integer.parseInt(request.getParameter("firstNo"));
		secondNo = Integer.parseInt(request.getParameter("secondNo"));
		result = firstNo + secondNo;
		out.println("Sum is  <b> " +result+ "</b><br/>");
		result = firstNo - secondNo;
		out.println("Sub is  <b>  " +result+ "</b><br/>");
		result = firstNo * secondNo;
		out.println("Mult is  <b>  " +result+ "</b><br/>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
