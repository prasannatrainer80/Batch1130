package com.java.junit;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class App {

  public static void main(String[] args) throws ParseException {
	  SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		LeaveDetails ld1 = new LeaveDetails(1, 1000, sdf.parse("2024-10-10"), sdf.parse("2024-10-12"), 3, 
				"EL", "PENDING", "Going Home", new Date());
		System.out.println(ld1);
 
  }

}
