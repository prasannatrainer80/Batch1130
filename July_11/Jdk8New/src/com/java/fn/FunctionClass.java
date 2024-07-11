package com.java.fn;

import java.util.function.Function;

public class FunctionClass implements Function<String, Integer> {

	@Override
	public Integer apply(String t) {
		// TODO Auto-generated method stub
		return t.length();
	}
	
}
