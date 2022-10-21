package com.bridgelabz;

public class Arrays {

	public static void main(String[] args) {
		
//		int rollNo[]; //declaration of array
//		int rollNo[] = {2,3,4,5,6,7,8}; 	//initialization of Array
		int rollNo[] = new int[10]; //declaration of array
		
		for(int i=0;i<10;i++) {
			rollNo[i] = 1230 + i;
		}
		
//		System.out.println(rollNo);
		for(int i=0;i<10;i++) {
			System.out.println(rollNo[i]);
		}
		
		System.out.println("5th index value = "+rollNo[4]);
		
//		1) Java Program to copy all elements of one array into another array
//		2) Java Program to find the frequency of each element in the array
		String names[] = {"Shubham", "Rahul", "Shubham", "mayur", "Anmol"};
		String namesCopy[] = new String[names.length];
		
		for(int i=0;i<names.length;i++) {
			namesCopy[i] = names[i];
		}
		
		for(int i=namesCopy.length-1;i>-1;i--) {
			System.out.println("Copied Elements = "+namesCopy[i]);
		}
		
	}
}
