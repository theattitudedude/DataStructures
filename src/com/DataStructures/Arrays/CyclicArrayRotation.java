package com.DataStructures.Arrays;

import java.util.Arrays;

public class CyclicArrayRotation {

	static int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

	public static void rotateArrayByNTimes(int arr[], int degree) {
		int iteration;
		for (iteration = 0; iteration < degree; iteration++) {
			rotateCyclicallyByOne(arr);
		}
	}

	private static void rotateCyclicallyByOne(int[] arr) {
		int temp = arr[arr.length - 1], iterator;
		for (iterator = arr.length - 1; iterator > 0; iterator--)
			arr[iterator] = arr[iterator - 1];
		arr[0] = temp;
	}

	public static void main(String[] args) {
		System.out.println("Array before rotation");
		System.out.println(Arrays.toString(arr));
		rotateArrayByNTimes(arr, 2);
		System.out.println("Array after rotation");
		System.out.println(Arrays.toString(arr));
	}
}
