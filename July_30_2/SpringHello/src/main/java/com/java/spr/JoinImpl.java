package com.java.spr;

public class JoinImpl implements Joining {

	private String greeting;
	private String laptopStatus;
	private String idcardStatus;
	
	
	public String getGreeting() {
		return greeting;
	}


	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}


	public String getLaptopStatus() {
		return laptopStatus;
	}


	public void setLaptopStatus(String laptopStatus) {
		this.laptopStatus = laptopStatus;
	}


	public String getIdcardStatus() {
		return idcardStatus;
	}


	public void setIdcardStatus(String idcardStatus) {
		this.idcardStatus = idcardStatus;
	}


	@Override
	public void show(String name) {
		System.out.println(greeting+name+"\n"+laptopStatus + "\n" +idcardStatus);
		
	}

}
