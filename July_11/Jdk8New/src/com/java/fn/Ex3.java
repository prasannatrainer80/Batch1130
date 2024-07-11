package com.java.fn;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Ex3 {

	static Consumer<Integer> lambdaException(Consumer<Integer> consumer) {
		return x -> {
			try {
				consumer.accept(x);
			} catch(ArithmeticException e) {
				System.err.println("Arithmetic Exception  " +e.getMessage());
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		};
	};
	
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(50,66,23,63,0,65);
		numbers.forEach(lambdaException(x -> System.out.println(90/x)));
	}
}
