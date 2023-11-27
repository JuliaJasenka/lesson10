package edu.training.lesson10.main;

public class Task14 {

	public static void main(String[] args) {
		int n = 7;
		int matrix[][] = new int[n][n];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = matrix[i].length - 1; j >= 0; j--) {
				matrix[i][i] = i + 1;
				System.out.printf("[%2d]", matrix[i][j]);
			}
			System.out.println();
		}

	}

}
