package com.java.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class DemoTest {
	
	@Test
	public void testEvenOdd() {
		Demo demo = new Demo();
		assertTrue(demo.evenOdd(6));
		assertFalse(demo.evenOdd(5));
	}
	
	@Test 
	public void testNull() {
		Demo demo1 = null;
		assertNull(demo1);
		Demo demo2 = new Demo();
		assertNotNull(demo2);
	}

	@Test
	public void testSayHello() {
		Demo demo = new Demo();
		assertEquals("Welcome to Java Programming...", demo.sayHello());
	}

	@Test
	public void testSum() {
		Demo demo = new Demo();
		assertEquals(5, demo.sum(2, 3));
	}
	
	@Test
	public void testMax3() {
		Demo demo = new Demo();
		assertEquals(7, demo.max3(7, 5, 3));
		assertEquals(7, demo.max3(5, 7, 3));
		assertEquals(7, demo.max3(5, 3, 7));
	}
	
	@Test
	public void testFact() {
		Demo demo = new Demo();
		assertEquals(6, demo.fact(3));
	}
}
