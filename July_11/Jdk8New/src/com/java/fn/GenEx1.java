package com.java.fn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class GenEx1 {

	public static void main(String[] args) {
		List<?> lt=new ArrayList<>();
		
		((ArrayList<Integer>)lt).add(20);
		((ArrayList<String>)lt).add("Hello");
		((ArrayList<Boolean>)lt).add(true);
		((ArrayList<Double>)lt).add(12.344);
		
		for (Object object : lt) {
			System.out.println(object);
		}
		
		
		List<?> lt1 = new ArrayList<Integer>();
	
		((ArrayList<Integer>)lt1).add(20);
		((ArrayList<String>)lt1).add("Hello");
		((ArrayList<Boolean>)lt1).add(true);
		((ArrayList<Double>)lt1).add(12.344);
	
		for (Object object : lt1) {
			System.out.println(object);
		}
	}
}
