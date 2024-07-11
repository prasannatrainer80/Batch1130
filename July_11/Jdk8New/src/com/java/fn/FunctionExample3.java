package com.java.fn;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionExample3 {
	public static void main(String[] args) {
		List<Integer> empno = Arrays.asList(1,2,5,6);
		Function<Integer,String> result = (Integer x) -> {
			if (x==1) {
				return "Siva Yadav";
			} else if (x==2) {
				return "Bhavana";
			} else if (x==3) {
				return "Kavitha";
			} else if (x==4) {
				return "Yegna";
			} else if (x==5) {
				return "Ramesh";
			} else if (x==6) {
				return "Prasanna";
			} return "Invalid";
		};
		empno.stream().map(result).forEach(x -> {
			System.out.println(x);
		});
	}
}
