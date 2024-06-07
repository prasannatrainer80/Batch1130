package com.java.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmployTest {

	@Test
	public void testConstructor() {
		Employ employ1 = new Employ();
		assertNotNull(employ1);
		Employ employ2 = new Employ(1, "Ramesh", "MALE", "Java", "Programmer", 88322);
		assertEquals(1, employ2.getEmpno());
		assertEquals("Ramesh", employ2.getName());
		assertEquals("MALE", employ2.getGender());
		assertEquals("Java", employ2.getDept());
		assertEquals("Programmer", employ2.getDesig());
		assertEquals(88322, employ2.getBasic(), 0);
	}
	
	@Test
	public void testGettersAndSetters() {
		Employ employ = new Employ();
		employ.setEmpno(1);
		employ.setName("Ramesh");
		employ.setGender("Male");
		employ.setDept("Java");
		employ.setDesig("Programmer");
		employ.setBasic(88323);
		
		assertEquals(1, employ.getEmpno());
		assertEquals("Ramesh", employ.getName());
		assertEquals("Male", employ.getGender());
		assertEquals("Java", employ.getDept());
		assertEquals("Programmer", employ.getDesig());
		assertEquals(88323, employ.getBasic(), 0);
	}

	@Test
	public void testToString() {
		String result = "Employ [empno=1, name=Ramesh, gender=MALE, dept=Java, desig=Programmer, "
				+ "basic=88322.0]";
		Employ employ1 = new Employ(1, "Ramesh", "MALE", "Java", "Programmer", 88322);
		assertEquals(result, employ1.toString());
	}
	@Test
	public void testHashCode() {
		Employ employ1 = new Employ(1, "Ramesh", "MALE", "Java", "Programmer", 88322);
		Employ employ2 = new Employ(1, "Ramesh", "MALE", "Java", "Programmer", 88322);
		assertEquals(employ1.hashCode(), employ2.hashCode());
	}
	
	@Test
	public void testEquals() {
		Employ employ1 = new Employ(1, "Ramesh", "MALE", "Java", "Programmer", 88322);
		Employ employ2 = new Employ(1, "Ramesh", "MALE", "Java", "Programmer", 88322);
		assertTrue(employ1.equals(employ2));
	}
}
