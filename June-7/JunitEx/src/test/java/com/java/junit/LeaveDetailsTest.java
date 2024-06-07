package com.java.junit;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class LeaveDetailsTest {

	@Test
	public void testConstructor() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		LeaveDetails ld = new LeaveDetails();
		assertNotNull(ld);
		LeaveDetails ld1 = new LeaveDetails(1, 1000, sdf.parse("2024-10-10"), sdf.parse("2024-10-12"), 3, 
					"EL", "PENDING", "Going Home", new Date());
		assertEquals(1, ld1.getLeaveId());
		assertEquals(1000, ld1.getEmpId());
		assertEquals("2024-10-10", sdf.format(ld1.getLeaveStartDate()));
		assertEquals("2024-10-12", sdf.format(ld1.getLeaveEndDate()));
		assertEquals(3, ld1.getNoOfDays());
		assertEquals("EL", ld1.getLeaveType());
		assertEquals("PENDING", ld1.getLeaveStatus());
		assertEquals("Going Home", ld1.getLeaveReason());
		assertEquals("2024-06-07", sdf.format(ld1.getAppliedOn()));
	}

	@Test
	public void testGettersAndSetters() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		LeaveDetails ld = new LeaveDetails();
		ld.setLeaveId(1);
		ld.setEmpId(1000);
		ld.setLeaveStartDate(sdf.parse("2024-10-10"));
		ld.setLeaveEndDate(sdf.parse("2024-10-12"));
		ld.setNoOfDays(3);
		ld.setLeaveType("EL");
		ld.setLeaveStatus("PENDING");
		ld.setLeaveReason("Going Home");
		ld.setAppliedOn(new Date());

		assertEquals(1, ld.getLeaveId());
		assertEquals(1000, ld.getEmpId());
		assertEquals("2024-10-10", sdf.format(ld.getLeaveStartDate()));
		assertEquals("2024-10-12", sdf.format(ld.getLeaveEndDate()));
		assertEquals(3, ld.getNoOfDays());
		assertEquals("EL", ld.getLeaveType());
		assertEquals("PENDING", ld.getLeaveStatus());
		assertEquals("Going Home", ld.getLeaveReason());
		assertEquals("2024-06-07", sdf.format(ld.getAppliedOn()));
		
	}
	
	@Test
	public void testEquals() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		LeaveDetails ld1 = new LeaveDetails(1, 1000, sdf.parse("2024-10-10"), sdf.parse("2024-10-12"), 3, 
				"EL", "PENDING", "Going Home", new Date());
		assertNotNull(ld1);
	}
	
	@Test
	public void testToString() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String result = "LeaveDetails [leaveId=1, empId=1000, leaveStartDate=2024-10-10, "
				+ "leaveEndDate=2024-10-12, noOfDays=3, leaveType=EL, leaveStatus=PENDING, "
				+ "leaveReason=Going Home, appliedOn=2024-06-07]";
		LeaveDetails ld1 = new LeaveDetails(1, 1000, sdf.parse("2024-10-10"), sdf.parse("2024-10-12"), 3, 
				"EL", "PENDING", "Going Home", new Date());
		assertEquals(result, ld1.toString());

	}
	
	@Test
	public void testHashCode() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		LeaveDetails ld1 = new LeaveDetails(1, 1000, sdf.parse("2024-10-10"), sdf.parse("2024-10-12"), 3, 
				"EL", "PENDING", "Going Home", new Date());
		LeaveDetails ld2 = new LeaveDetails(1, 1000, sdf.parse("2024-10-10"), sdf.parse("2024-10-12"), 3, 
				"EL", "PENDING", "Going Home", new Date());
		assertEquals(ld1.hashCode(), ld2.hashCode());
	}
}
