package com.DataStructures.Arrays;

import java.util.Arrays;

public class ReorderToGivenIndexes {

	static int arr[] = { 50, 40, 70, 60, 90 };
	static int index[] = { 3, 0, 4, 1, 2 };

	static String rearrangeArrayToIndex(int[] arr, int[] index) {
		int temp;
		int tempArray[] = new int[arr.length];
		if (arr.length != index.length)
			return "Array Index mismatch";

		else {
			tempArray = new int[arr.length];
			for (int i = 0; i < arr.length; i++)
				tempArray[index[i]] = arr[i];
			arr = Arrays.copyOf(tempArray, tempArray.length);
		}
		return Arrays.toString(arr);
	}

	public static void main(String[] args) {
		System.out.println(rearrangeArrayToIndex(arr, index));
	}
}