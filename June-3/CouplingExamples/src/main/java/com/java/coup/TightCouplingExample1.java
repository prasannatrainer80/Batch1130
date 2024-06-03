package com.java.coup;

class TrainingDetails {
	
	public void exam() {
		System.out.println("Weekly Once anyday i will conduct Exam");
	}
	
	public void timings() {
		System.out.println("From 11.30 to 13.30 PM ");
	}
	
	public void topic() {
		System.out.println("Right Now Java JDBC Going On...");
	}
	
	public void comments() {
		System.out.println("Project in JDBC High Priority...");
	}
}

class Admin {
	
	TrainingDetails details = new TrainingDetails();
	public void Show() {
		details.timings();
		details.topic();
		details.comments();
		details.exam();
	}
}
public class TightCouplingExample1 {
	public static void main(String[] args) {
		new Admin().Show();
	}
}
