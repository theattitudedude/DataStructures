package com.DataStructures.Arrays;

public class LeftArrayRotationNTimes {

	private static int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

	private static void LeftRotateArraybyN(int array[], int degree) {

		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[(i + degree) % arr.length] + " ");
	}

	public static void main(String[] args) {
		LeftRotateArraybyN(arr, 4);
	}

}
