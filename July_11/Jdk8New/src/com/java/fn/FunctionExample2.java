package com.java.fn;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.function.Function;

public class FunctionExample2 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,5,6,13,15);
		Function<Integer, String> result = (Integer x) -> {
			 if (x >= 5) {
				 return "Hello";
			 } else {
				 return "Hi";
			 }
		};
		list.stream().map(result).forEach(x -> {
			System.out.println(x);
		});
	}
}
