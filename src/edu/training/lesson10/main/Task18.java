package edu.training.lesson10.main;

public class Task18 {

	public static void main(String[] args) {
		int n = 7;
		int matrix[][] = new int[n][n];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length-1; j++) {
				matrix[i][j] = i + 1;
				
				
				System.out.printf("[%2d]", matrix[i][j]);
			}
			System.out.println();
		}

	}

}
