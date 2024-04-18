package com.java.test;

public class Test3 {

	public static void main(String[] args) {
		Employ employ1 = new Employ();
		employ1.empno = 1;
		employ1.name = "Bhavanya";
		employ1.basic =88323;
		
		Employ employ2 = new Employ();
		employ2.empno = 2;
		employ2.name = "Shilpa";
		employ2.basic =99323;
		
		Employ employ3 = new Employ();
		employ3.empno = 1;
		employ3.name = "Bhavanya";
		employ3.basic =88323;
		
		System.out.println(employ1.equals(employ2));
		System.out.println(employ1.equals(employ3));
		
	}
}
