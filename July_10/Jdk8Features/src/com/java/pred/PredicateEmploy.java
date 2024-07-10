package com.java.pred;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateEmploy {
	public static void main(String[] args) {
		List<Employ> employList = new ArrayList<Employ>();
		employList.add(new Employ(1, "Ramesh", "Male", "Java", "Programmer", 94235));
		employList.add(new Employ(2, "Akhil", "Male", "Java", "Programmer", 84235));
		employList.add(new Employ(3, "Bhavanya", "Female", "Angular", "Programmer", 99235));
		employList.add(new Employ(4, "Kavitha", "Female", "Angular", "Programmer", 77235));
		employList.add(new Employ(5, "Babasai", "Male", "Java", "Programmer", 88235));
		employList.add(new Employ(6, "Yegna", "Male", "React", "Programmer", 89235));
		employList.add(new Employ(7, "Nikhitha", "Female", "React", "Programmer", 91235));
		
		List<Employ> result1 = employList.stream().filter(javaRecords()).collect(Collectors.toList());
		System.out.println("Java Records  ");
		result1.forEach(x -> {
			System.out.println(x);
		});
		
		List<Employ> result2 = employList.stream().filter(gender("Male")).collect(Collectors.toList());
		result2.forEach(x -> {
			System.out.println(x);
		});
	}
	
	public static Predicate<Employ> javaRecords() {
		return x -> x.getDept().equals("Java");
	}
	
	public static Predicate<Employ> gender(String gen) {
		return x -> x.getGender().equals(gen);
	}
}
