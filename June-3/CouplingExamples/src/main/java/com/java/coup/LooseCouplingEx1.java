package com.java.coup;

class Engine {
	
	private String engineName;
	private String capacity;
	private String expiryPeriod;

	public String getEngineName() {
		return engineName;
	}
	public void setEngineName(String engineName) {
		this.engineName = engineName;
	}
	public String getCapacity() {
		return capacity;
	}
	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}
	public String getExpiryPeriod() {
		return expiryPeriod;
	}
	public void setExpiryPeriod(String expiryPeriod) {
		this.expiryPeriod = expiryPeriod;
	}
	@Override
	public String toString() {
		return "Engine [engineName=" + engineName + ", capacity=" + capacity + ", expiryPeriod=" + expiryPeriod + "]";
	}
	public Engine(String engineName, String capacity, String expiryPeriod) {
		this.engineName = engineName;
		this.capacity = capacity;
		this.expiryPeriod = expiryPeriod;
	}
	public Engine() {
	}

	
}

class Car {
	private String carName;
	private String model;
	private Engine engine;
	
	public Car(String carName, String model, Engine engine) {
		this.carName = carName;
		this.model = model;
		this.engine = engine;
	}

	public Car() {
		// TODO Auto-generated constructor stub
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public void showAllInfo() {
		System.out.println("Car Name  " +carName);
		System.out.println("Model   " +model);
		System.out.println("Engine Info  " +engine);
	}
}

public class LooseCouplingEx1 {
	public static void main(String[] args) {
		Engine engine1 = new Engine("New Version", "17.5","20 Years");
		Engine engine2 = new Engine("Upgraded", "2.4", "10 Years");
		
		Car c1 = new Car("Maruthi 800", "1999", engine2);
		Car c2 = new Car("Scross", "2022", engine1);
		
		c1.showAllInfo();
		c2.showAllInfo();
	}
}
