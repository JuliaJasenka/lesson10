package edu.training.lesson10.main;

public class Task17 {

	public static void main(String[] args) {

		int n = 6;
		int matrix[][] = new int[n][n];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (i == 0 || j == 0 || i == matrix.length - 1 || j == matrix[i].length - 1)
					matrix[i][j] = 1;
				System.out.printf("[%2d]", matrix[i][j]);
			}
			System.out.println();
		}

	}

}
