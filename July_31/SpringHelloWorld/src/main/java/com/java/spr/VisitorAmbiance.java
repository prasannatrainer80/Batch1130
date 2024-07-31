package com.java.spr;

public class VisitorAmbiance implements Visitor {

	private String greet;
	private String place;
	private String snacks;
	private String info;
	
	public String getGreet() {
		return greet;
	}

	public void setGreet(String greet) {
		this.greet = greet;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getSnacks() {
		return snacks;
	}

	public void setSnacks(String snacks) {
		this.snacks = snacks;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	@Override
	public void showAmbiance(String visitor) {
		System.out.println(greet + visitor + "\n" +place + "\n" + "Please Have " +snacks + "\nYou need to Wait " +info);
		
	}

}
