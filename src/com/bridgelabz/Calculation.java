package com.bridgelabz;

public class Calculation {

	//definging the methods or functions
	//1 no argurment no ruturn type
	void printingWelcomeMessage() {
		//statement => opration
		System.out.println("Welcome to Bridgelazs...");
	}
	
	//2 pass argurment, no return type
	void printMyName(String name) {
		System.out.println("My name is "+name);
	}
	
	//3 no argurment, return type
	double getPiValue() {
		return 3.142;
	}
	
	//4 pass argument, return type
	byte getLengthOfMyName(String name) {
		return (byte) name.length();
	}
	
	public static void main(String[] args) {
		Calculation calculation = new Calculation();
		//calling the methods
		calculation.printingWelcomeMessage();
		calculation.printMyName("Shubham");
//		double pi = calculation.getPiValue();
		System.out.println("Pi value = "+calculation.getPiValue());
//		System.out.println("Pi value = "+pi);
		System.out.println("Length of My name = "+calculation.getLengthOfMyName("Shubham"));
	}
}
// 4 type of methods
//1 no argurment, no ruturn type
//2 pass argurment, no return type
//3 no argurment, return type
//4 pass argument, return type