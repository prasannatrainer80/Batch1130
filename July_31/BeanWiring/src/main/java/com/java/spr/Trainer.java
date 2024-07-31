package com.java.spr;

import java.util.List;

public class Trainer {
	
	private String trainerName;
	private List<Student> studentsList;
	
	public String getTrainerName() {
		return trainerName;
	}
	
	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}
	
	public List<Student> getStudentsList() {
		return studentsList;
	}
	
	public void setStudentsList(List<Student> studentsList) {
		this.studentsList = studentsList;
	}

	public void teaching() {
		System.out.println("Trainer  " +trainerName + " Sharing lunch with Students");
		for (Student student : studentsList) {
			student.display();
		}
	}

}
