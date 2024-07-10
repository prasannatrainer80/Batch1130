package com.java.pred;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateEx4 {
	public static void main(String[] args) {
		List<String> students = Arrays.asList("Satyanath","Ramesh","Bhavana","Yegna","Shiva","Shiva Yadav",
				"Satya Lukka","Bhavanya","Sravani","Siva Sai","Satyanath");
		Predicate<String> p1 = x -> x.startsWith("S");
		Predicate<String> p2 = x -> x.startsWith("B");
		List<String> result = students.stream().filter(p1.and(p2)).collect(Collectors.toList());
		result.forEach(x -> {
			System.out.println(x);
		});
	}
}
