package com.DataStructures.Arrays;

public class ArrayRearrangement {

	static int arr[] = { 19, 7, 0, 3, 18, 15,-1, 6, 1, 8, 11, 10, 9, 5, 13, 16, 2, 14, 17, 4 };

	public static void RearrangeArray(int arr[]) {

		for (int i = 0; i < arr.length; i++) {
			compareArrayAndIndex(arr, i);
		}

	}

	private static void compareArrayAndIndex(int[] arr, int i) {
		if (arr[i] == -1 || arr[i] == i)
			return;
		else
			swapPositions(arr, i);
	}

	private static void swapPositions(int[] arr, int i) {
		int temp = arr[i];
		arr[i] = arr[temp];
		arr[temp] = temp;

		compareArrayAndIndex(arr, i);

	}

	private static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
	}

	public static void main(String[] args) {
		RearrangeArray(arr);
		printArray(arr);
	}

}
