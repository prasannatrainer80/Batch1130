package com.java.fn;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionExample1 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,5,6,13,15);
		Function<Integer,Boolean> f1 = i -> i >= 5;
		list.stream().map(f1).forEach(System.out::println);
		
	}
}
