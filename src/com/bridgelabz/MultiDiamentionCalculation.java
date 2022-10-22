package com.bridgelabz;

public class MultiDiamentionCalculation {

	int[][] addition(int x[][], int y[][], int row, int col) {
		System.out.println("Addition in progress...");
		int r[][] = new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				r[i][j] = x[i][j] + y[i][j];
			}
		}
		System.out.println("Addition done...");
		return r;
	}
	
	int[][] substraction(int x[][], int y[][], int row, int col) {
		int r[][] = new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				r[i][j] = x[i][j] - y[i][j];
			}
		}
		return r;
	}
	
	public static void main(String[] args) {
		MultiDiamentionCalculation calculation = new MultiDiamentionCalculation();
		
		int row = 2;
		int col = 2;
		int x[][] = new int[row][col];
		
		x[0][0] = 40;
		x[0][1] = 50;
		x[1][0] = 60;
		x[1][1] = 70;
		
		int y[][] = new int[row][col];
		
		y[0][0] = 40;
		y[0][1] = 50;
		y[1][0] = 60;
		y[1][1] = 70;
		
		int r[][] = calculation.addition(x, y, row, col);
		
		for(int i = 0; i<row;i++ ) {
			for(int j=0;j<col;j++) {
				System.out.print("[i = "+i+"][j ="+j+"] = "+r[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
