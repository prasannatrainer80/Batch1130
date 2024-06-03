package com.java.coup;

class PythonDetails {
	
	private String name;
	private double fee;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	public PythonDetails(String name, double fee) {
		this.name = name;
		this.fee = fee;
	}
	public PythonDetails() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "PythonDetails [name=" + name + ", fee=" + fee + "]";
	}
	
	
}

class JavaDetails {
	
	private String name;
	private double fee;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	public JavaDetails(String name, double fee) {
		this.name = name;
		this.fee = fee;
	}

	public JavaDetails() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "JavaDetails [name=" + name + ", fee=" + fee + "]";
	}
	
	
}

class DotnetDetails {
	
	private String name;
	private double fee;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	@Override
	public String toString() {
		return "DotnetDetails [name=" + name + ", fee=" + fee + "]";
	}
	public DotnetDetails(String name, double fee) {
		this.name = name;
		this.fee = fee;
	}
	public DotnetDetails() {
		// TODO Auto-generated constructor stub
	}
}

public class TightCouplingExample2 {
	
	public void showInfo(String ob) {
		if (ob.equals("DotnetDetails")) {
			DotnetDetails details = new DotnetDetails("Dotnet Fullstack", 90000);
			System.out.println(details);
		}
		if (ob.equals("JavaDetails")) {
			JavaDetails details = new JavaDetails("Java FullStack", 120000);
			System.out.println(details);
		}
		if (ob.equals("PythonDetails")) {
			PythonDetails details = new PythonDetails("Python", 40000);
			System.out.println(details);
		}
	}
	public static void main(String[] args) {
		String ob = "DotnetDetails";
		new TightCouplingExample2().showInfo(ob);
	}
}
