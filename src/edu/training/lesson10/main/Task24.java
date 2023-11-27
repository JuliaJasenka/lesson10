package edu.training.lesson10.main;

import java.util.Random;

public class Task24 {

	public static void main(String[] args) {
		// Сформировать квадратную матрицу порядка N по правилу: A[I,J]=sin⁡((I^2-J^2)/N)и подсчитать количество положительных элементов в ней.

	 	int n = 5;
		double[][] matrix = new double[n][n];
		int sum = 0;
				
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = Math.sin((Math.pow(i, 2) - Math.pow(j, 2)) /matrix.length);

				System.out.printf("[%2d]", matrix[i][j]);
			}
			System.out.println();

		}

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] > 0) {
					sum += matrix[i][j];
				}
			}
		}
		System.out.println("Сумма отрицательных нечетных элементов: " + sum);
	}
}
