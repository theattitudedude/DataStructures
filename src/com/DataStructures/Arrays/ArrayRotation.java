package com.DataStructures.Arrays;

public class ArrayRotation {

	void leftRotate(int arr[], int degree) {
		for (int i = 0; i < degree; i++) {
			leftRotateArray(arr);

		}
	}

	private void leftRotateArray(int[] arr) {
		int temp = arr[0];
		for (int i = 0; i < arr.length - 1; i++) {
			arr[i] = arr[i + 1];
		}
		arr[arr.length - 1] = temp;
	}

	private void printArray(int[] array) {
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		ArrayRotation arrayRotation = new ArrayRotation();
		arrayRotation.leftRotate(arr, 3);
		arrayRotation.printArray(arr);
	}
}
