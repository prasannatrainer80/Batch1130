package com.java.pred;

import java.util.function.Predicate;

public class PredicateEx1 {

	public static void main(String[] args) {
		Predicate<Integer> pr = a -> (a >= 18);
		String res =(pr.test(18) ? "You Can Vote" : "You Cannot Vote");
		System.out.println(res);
	}
}
