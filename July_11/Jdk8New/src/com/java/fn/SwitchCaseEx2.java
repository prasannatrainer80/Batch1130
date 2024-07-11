package com.java.fn;

public class SwitchCaseEx2 {
	public int show(int year, int month) {
		int result = switch(month) {
		case 1,3,5,7,8,10,12 -> 31;
		case 4, 6, 9,11 -> 30;
		case 2 -> {
			if (year%4==0) {
				System.out.println("Its Leap year...");
				yield 29;
			} else {
				System.out.println("Its Not Leap Year...");
				yield 28;
			}
		}
		default -> 0;
		
		};
		return result;
	}
	public static void main(String[] args) {
		int year=2021,month=2;
		SwitchCaseEx2 obj = new SwitchCaseEx2();
		System.out.println(obj.show(year, month));
	}
}
