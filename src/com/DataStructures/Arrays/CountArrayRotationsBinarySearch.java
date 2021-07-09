package com.DataStructures.Arrays;

public class CountArrayRotationsBinarySearch {

	private static int arr[] = { 1, 2, 3, 4 };

	private static int countRotations(int arr[], int startIndex, int endIndex) {
		if (endIndex < startIndex)
			return 0;

		if (endIndex == startIndex)
			return startIndex;

		int middleIndex = startIndex + (endIndex - startIndex) / 2;

		if (middleIndex < endIndex && arr[middleIndex + 1] < arr[middleIndex])
			return middleIndex + 1;

		if (middleIndex > startIndex && arr[middleIndex] < arr[middleIndex - 1])
			return middleIndex;

		if (arr[middleIndex] < arr[endIndex])
			return countRotations(arr, startIndex, middleIndex - 1);
		
		return countRotations(arr, middleIndex + 1, endIndex);

	}

	public static void main(String[] args) {
		System.out.println("Array is rotated " + countRotations(arr, 0, arr.length - 1) + " times.");

	}
}