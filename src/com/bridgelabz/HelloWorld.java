package com.bridgelabz;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World...");
		System.out.println(Math.sqrt(16));
		System.out.println(Math.ceil(10.4));
		System.out.println(Math.floor(10.6));
		System.out.println(Math.round(10.4));
		for(int i = 0;i<10;i++) {
			System.out.println(Math.round((Math.random()*100)));
		}
		
		String str1 = "Anmol";
		String str = new String("Shubham");
		str1.concat(" Chavan");
		
		StringBuilder sb = new StringBuilder();
		sb.append("Hi All,");
		sb.append("I am going to explain new StringBuilder class");
		sb.append("I am expecting you are understanding...");
		
		System.out.println(sb.toString());
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your name");
		String name = scanner.next();
		System.out.println(name);
		
	}
}
// string pool area - heap