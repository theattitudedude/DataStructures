package com.DataStructures.Arrays;

public class BlockSwapArrayRotation {

	public static void leftRorateArray(int arr[], int degree) {

		if (degree == 0 || degree == arr.length)
			return;

		int i, j;
		i = degree;
		j = arr.length - degree;

		while (i != j) {
			if (i < j) {
				swap(arr, degree - i, degree + j - i, i);
				j -= i;
			} else {
				swap(arr, degree - i, degree, j);
				i -= j;
			}
		}

		swap(arr, degree - i, degree, i);
	}

	public static void swap(int arr[], int arrayFirstIndex, int arraySecondIndex, int depth) {
		int i, temp;
		for (i = 0; i < depth; i++) {
			temp = arr[arrayFirstIndex + i];
			arr[arrayFirstIndex + i] = arr[arraySecondIndex + i];
			arr[arraySecondIndex + i] = temp;
		}
	}

	public static void printArray(int arr[]) {
		int i;
		for (i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		leftRorateArray(arr, 5);
		printArray(arr);
	}
}
