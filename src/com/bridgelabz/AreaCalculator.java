package com.bridgelabz;

public class AreaCalculator {
	
	double getPIValue() {
		return 3.142;
	}

	double getAreaOfRectangle(double l, double b) {
		return l * b;
	}
	
	double getAreaOfCircle(double r) {
		double pi = getPIValue();
		return pi * r * r;
	}
	
	public static void main(String[] args) {
		AreaCalculator areaCalculator = new AreaCalculator();
		System.out.println("Area Of Rectangle = "+areaCalculator.getAreaOfRectangle(5.0, 10.0));
		System.out.println("Area of Circle = "+areaCalculator.getAreaOfCircle(5.5));
	}
}
