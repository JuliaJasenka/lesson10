package edu.training.lesson10.main;

public class Task15 {

	public static void main(String[] args) {
		int n = 7;
		int matrix[][] = new int[n][n];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][i] = matrix[i].length-i;
				System.out.printf("[%2d]", matrix[i][j]);
			}
			System.out.println();
		}
	}
}
