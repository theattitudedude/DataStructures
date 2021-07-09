package com.DataStructures.Arrays;

import java.util.Arrays;

public class CyclicArrayRotationWithPointers {

	static int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

	public static void rotateArrayByNTimes(int arr[], int degree) {
		int iteration;
		for (iteration = 0; iteration < degree; iteration++) {
			rotateCyclicallyByOne(arr);
		}
	}

	private static void rotateCyclicallyByOne(int[] arr) {
		int iterator = 0, j = arr.length - 1;
		while (iterator != j) {
			int temp = arr[iterator];
			arr[iterator] = arr[j];
			arr[j] = temp;
			iterator++;
		}
	}

	public static void main(String[] args) {
		System.out.println("Array before rotation");
		System.out.println(Arrays.toString(arr));
		rotateArrayByNTimes(arr, 5);
		System.out.println("Array after rotation");
		System.out.println(Arrays.toString(arr));
	}
}
