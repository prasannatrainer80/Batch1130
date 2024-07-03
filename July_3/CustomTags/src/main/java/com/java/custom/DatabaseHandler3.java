package com.java.custom;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.BodyTagSupport;

public class DatabaseHandler3 extends BodyTagSupport {

	@Override
	public int doStartTag() throws JspException {
		return EVAL_BODY_BUFFERED;

	}
	
	@Override
	public int doEndTag() throws JspException {
		String body = bodyContent.getString();
		String[] values = body.split(" ");
		int empno = Integer.parseInt(values[0]);
		String name = values[1].trim();
		String gender = values[2].trim();
		String dept = values[3].trim();
		String desig = values[4].trim();
		double basic = Double.parseDouble(values[5]);
		JspWriter out = pageContext.getOut();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sonixpractice",
					"root", "root");
			String cmd = "Insert into Employ(empno,name,gender,dept,desig,basic) "
					+ " values(?,?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(cmd);
			pst.setInt(1, empno);
			pst.setString(2, name);
			pst.setString(3, gender);
			pst.setString(4, dept);
			pst.setString(5, desig);
			pst.setDouble(6, basic);
			pst.executeUpdate();
			out.println("Record Inserted...");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 	 return EVAL_PAGE;
	}
}
