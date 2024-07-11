package com.java.fn;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class MainProgNew {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Ramesh","Rajendra","Shiva Yadav","Yegna","Bhavana","Kavitha");
		Function<String, Integer> fc = new FunctionClass();
		for (String string : names) {
			System.out.println(fc.apply(string));
		}
	}
}
