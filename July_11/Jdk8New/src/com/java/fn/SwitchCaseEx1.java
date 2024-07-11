package com.java.fn;

public class SwitchCaseEx1 {

	public void show(int month) {
		switch(month) {
		case 1,3,5,7,8,10,12 -> System.out.println("Month Has 31 Days");
		case 4, 6, 9,11 -> System.out.println("Month has 30 Days");
		case 2 -> System.out.println("Month has either 28 or 29 days...");
		default -> System.out.println("Invalid Number");
		}
	}
	public static void main(String[] args) {
		int month=3;
		SwitchCaseEx1 obj = new SwitchCaseEx1();
		obj.show(month);
	}
}
