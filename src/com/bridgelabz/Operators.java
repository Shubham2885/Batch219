package com.bridgelabz;

public class Operators {

	public static void main(String[] args) {
		int x = 60;
		int y = 20;
		int z = 70;
		// ++ means increment by 1
		// -- means decrement by 1
		// postfix
		// x=x+1;
//		int y = x--;
//		System.out.println(y);
//		System.out.println(x);
		System.out.println(x < y);
		System.out.println(x > y);
		System.out.println(x <= y);
		System.out.println(x >= y);
		System.out.println(x == y);
		System.out.println(x != y);
		
		
//		if(x > y && x > z) {
//			System.out.println("X is greater");
//		}else if(y > x && y > z){
//			System.out.println("Y is greater");
//		}else {
//			System.out.println("Z is greater");
//		}
		
		// condition ? "true..." : "false.."
		String result = x > y && x > z ? "x is greater" : (y > x && y > z) ? "y is greater" : "z is greater";
		System.out.println(result);
		
		String day = "Mon";
		
		switch(day) {
		case "Mon" : System.out.println("Today is Monday...");
		break;
		case "Tue" : System.out.println("Today is Tueday...");
		break;
		case "Wed" : System.out.println("Today is Wedday...");
		break;
		case "Thu" : System.out.println("Today is Thuday...");
		break;
		case "Fri" : System.out.println("Today is Friday...");
		break;
		case "Sat" : System.out.println("Today is Satday...");
		break;
		default : System.out.println("invalid input...");
		break;
		}
		
	}
}

// Logical Table for AND => &&
// OP1 OP2 Result
// T	T	T
// F	T	F
// T	F	F
// F	F	F

// Logical Table for OR => ||
// OP1 OP2 Result
// T	T	T
// F	T	T
// T	F	T
// F	F	F