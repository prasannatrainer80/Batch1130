package com.java.pred;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateEx3 {
	public static void main(String[] args) {

			Predicate<Integer> p1 = x -> x > 5;
			Predicate<Integer> p2 = x -> x <= 8;
			List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
			List<Integer> filterd = list.stream().filter(p1.and(p2)).collect(Collectors.toList());
			filterd.forEach(x -> {
				System.out.println(x);
			});
			
		}
	}
