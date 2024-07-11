package com.java.fn;

import java.util.function.Function;

public class MainProg {
	public static void main(String[] args) {
		Function<String, Integer> fc = new FunctionClass();
		System.out.println(fc.apply("Ramesh"));
	}
}
