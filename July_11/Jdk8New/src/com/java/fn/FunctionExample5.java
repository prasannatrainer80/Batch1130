package com.java.fn;

import java.util.function.Function;

public class FunctionExample5 {
	public static void main(String[] args) {
		Function<String, Integer> len = (String x) -> {
			return x.length();
		};
		
		String str="Hello World...";
		System.out.println(len.apply(str));
	}
}
