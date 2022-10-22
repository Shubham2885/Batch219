package com.bridgelabz;

public class MultiDiamentionArray {

	public static void main(String[] args) {
		
		int row = 2;
		int col = 2;
		int twoDArray[][] = new int[row][col];
		
		twoDArray[0][0] = 40;
		twoDArray[0][1] = 50;
		twoDArray[1][0] = 60;
		twoDArray[1][1] = 70;
		
		for(int i = 0; i<row;i++ ) {
			for(int j=0;j<col;j++) {
				System.out.print("[i = "+i+"][j ="+j+"] = "+twoDArray[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
