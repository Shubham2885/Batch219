package com.bridgelabz;

public class Looping {

	public static void main(String[] args) {
		// for			-> when you know the specific size or fixed iteration
		// while		-> when you don't know how many time the iteration will happened..
		// do-while		-> when you want execute the statement at least once then you check condition
		
//		for(initialization;condition;increment/decrement) {
//			
//		}
		//wap to print the 10 to 1 number in reverse order...
		for(int i=10;i>=1;i--) {	//condition check => n+1
//			if(i%2 == 0) {			//condition check => n
				System.out.println(i);// n/2
//			}
		}
		
		//wap to print sum of the digit in given num 1234;
		int num = 12345;
		int sum = 0;
		while(num != 0) {
			int rem = num % 10;
			System.out.println("Rem : "+rem);
			sum = sum + rem;
			System.out.println("Sum : "+sum);
			num = num / 10;
			System.out.println("Div : "+num);
		}
		
		System.out.println("final Sum : "+sum);
		
		do {
			System.out.println("Print my name...");
		}while(false);
		
		
		//wap to print pattern *
		for(int i=0;i<5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
			
	}
}
//*
//* *
//* * *
//* * * *
//* * * * *