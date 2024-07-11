package com.java.fn;

import java.util.Arrays;
import java.util.List;

public class Ex2 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(50,66,23,63,0,65);
		numbers.forEach(x-> {
			try {
				System.out.println(90 / x);
			}
			catch(ArithmeticException e) {
				System.out.println("Arithmetic Exception Occurred " +e.getMessage());
			}
			catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
	}
}
