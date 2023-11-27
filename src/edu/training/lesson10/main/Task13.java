package edu.training.lesson10.main;

public class Task13 {

	public static void main(String[] args) {

		int n = 7;
		int[][] matrix = new int[n][n];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (i % 2 == 0) {
					matrix[i][j] = j + 1;
					System.out.printf("[%2d]", matrix[i][j]);
				} else {
					matrix[i][j] = matrix[i].length - j;
					System.out.printf("[%2d]", matrix[i][j]);
				}
			}
			System.out.println();
		}
	}
}
