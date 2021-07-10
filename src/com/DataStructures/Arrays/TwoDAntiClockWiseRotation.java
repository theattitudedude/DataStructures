package com.DataStructures.Arrays;

/*
 * Inplace rotate square matrix by 90 degrees
 * 
 * Time Complexity: O(n*n), where n is side of array. 
 * 		A single traversal of the matrix is needed.
 * Space Complexity: O(1).
 * 		As a constant space is needed
 */
public class TwoDAntiClockWiseRotation {

	private static int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8, }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

	private static int MatrixSize = 4;

	private static void DDArrayRotation(int arr[][], int MatrixSize) {

		for (int x = 0; x < MatrixSize / 2; x++) {
			for (int y = x; y < MatrixSize - x - 1; y++) {
				int temp = arr[x][y];
				arr[x][y] = arr[y][MatrixSize - 1 - x];
				arr[y][MatrixSize - x - 1] = arr[MatrixSize - x - 1][MatrixSize - y - 1];
				arr[MatrixSize - x - 1][MatrixSize - y - 1] = arr[MatrixSize - y - 1][x];
				arr[MatrixSize - y - 1][x] = temp;

			}

		}
	}

	private static void printArray(int arr[][], int MatrixSize) {
		for (int i = 0; i < MatrixSize; i++) {
			for (int j = 0; j < MatrixSize; j++)
				System.out.print(arr[i][j] + " ");
			System.out.println();
		}
	}

	public static void main(String[] args) {
		DDArrayRotation(arr, MatrixSize);
		printArray(arr, MatrixSize);

	}

}
