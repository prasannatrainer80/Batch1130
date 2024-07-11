package com.java.fn;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionExample4 {

	public static void main(String[] args) {
		Employ[] arr = new Employ[] {
			new Employ(1, "Shiva yadav", 63233.44),
			new Employ(2, "Manohar", 99434),
			new Employ(3, "Sudharshan", 66444.44),
			new Employ(4, "Jogeshwar", 89423.44),
			new Employ(5, "KrishnaVeni", 91153.44),
		};
		
		List<Integer> emps = Arrays.asList(1,2,3,4,5);
		
		Function<Integer, Employ> result = (Integer x) -> {
			if (x==1) {
				return arr[0];
			} else if (x==2) {
				return arr[1];
			} else if (x==3) {
				return arr[2];
			} else if (x==4) {
				return arr[3];
			} else if (x==5) {
				return arr[4];
			}
			return null;
		};
		
		emps.stream().map(result).forEach(x -> {
			System.out.println(x);
		});
	}
}
