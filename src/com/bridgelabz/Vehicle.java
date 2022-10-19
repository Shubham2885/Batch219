package com.bridgelabz;

public class Vehicle {

	byte numberOfWheels; 
	String color;
	String brand;
	byte numberOfGear;
	
	static String fuelType = "Petrol";
	
	void driving(){
		
	}
	
	void changingGear(){
		
	}
	
	void applyingBreak(){
		
	}
	
	void accelaratingSpeed(){
		
	}

	public static void main(String args[]) {
		Vehicle car = new Vehicle();
		car.numberOfWheels = 4;
		car.color = "WhiteBlack";
		car.brand = "BMW";
		car.numberOfGear = 6;
		
		Vehicle auto = new Vehicle();
		auto.numberOfWheels = 3;
		auto.color = "YellowBlack";
		auto.brand = "Bajaj";
		auto.numberOfGear = 4;
		
		Vehicle bike = new Vehicle();
		bike.numberOfWheels = 2;
		bike.color = "WhiteBlack";
		bike.brand = "BMW";
		bike.numberOfGear = 5;
		
		System.out.println(car.numberOfWheels);
		System.out.println(auto.numberOfWheels);
		System.out.println(bike.numberOfWheels);
		System.out.println(car.fuelType);
		System.out.println(auto.fuelType);
		System.out.println(bike.fuelType);
	}
}
