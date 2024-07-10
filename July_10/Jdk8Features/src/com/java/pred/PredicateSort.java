package com.java.pred;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class PredicateSort {

	public static void main(String[] args) {
		List<Employ> employList = new ArrayList<Employ>();
		employList.add(new Employ(1, "Ramesh", "Male", "Java", "Programmer", 94235));
		employList.add(new Employ(2, "Akhil", "Male", "Java", "Programmer", 84235));
		employList.add(new Employ(3, "Bhavanya", "Female", "Angular", "Programmer", 99235));
		employList.add(new Employ(4, "Kavitha", "Female", "Angular", "Programmer", 77235));
		employList.add(new Employ(5, "Babasai", "Male", "Java", "Programmer", 88235));
		employList.add(new Employ(6, "Yegna", "Male", "React", "Programmer", 89235));
		employList.add(new Employ(7, "Nikhitha", "Female", "React", "Programmer", 91235));
		Stream<Employ> sorted = employList.stream().sorted((t1,t2) -> {
			return t1.getName().compareTo(t2.getName());
		});
		System.out.println("Sorted Data");
		sorted.forEach(x -> {
			System.out.println(x);
		});
		
		
	}
}
