package com.java.custom;

import java.io.IOException;
import java.util.Date;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class DateTag extends TagSupport {

	@Override
	public int doStartTag() throws JspException {
		JspWriter out = pageContext.getOut();
		Date date = new Date();
		try {
			out.println("Date is " +date.getDate() + date.getMonth()+1 + date.getYear() + " " + date.getHours() + ":" + date.getMinutes() 
					+ ":" +date.getSeconds());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return SKIP_BODY;
	}
}
