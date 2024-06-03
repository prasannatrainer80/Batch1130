package com.java.coup;

interface Training {
	void topic();
}

class Dotnet implements Training {

	@Override
	public void topic() {
		System.out.println("Dotnet Training Going...");
	}	
}

class Java implements Training {

	@Override
	public void topic() {
		System.out.println("Java Training Going...");
	}
}

class Sql implements Training {

	@Override
	public void topic() {
		System.out.println("Sql Training Going...");
	}
}


public class LooseCouplingEx2 {
	public static void main(String[] args) {
		Training t1 = new Dotnet();
		t1.topic();
		Training t2 = new Java();
		t2.topic();
		Training t3 = new Sql();
		t3.topic();
	}
}
