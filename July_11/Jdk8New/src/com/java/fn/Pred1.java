package com.java.fn;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Pred1 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,5,6,13,15);
		Predicate<Integer> pred = i -> i >=5;
		list.stream().filter(pred).forEach(x -> System.out.println(x));
	}
}
