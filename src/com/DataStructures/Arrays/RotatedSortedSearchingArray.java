package com.DataStructures.Arrays;

public class RotatedSortedSearchingArray {

	public static int pivotedBinarySearch(int arr[], int length, int key) {

		int pivot = findPivot(arr, 0, length - 1);

		if (pivot == -1)
			return binarySearch(arr, 0, length - 1, key);

		if (arr[pivot] == key)
			return pivot;

		if (arr[0] <= key)
			return binarySearch(arr, 0, pivot - 1, key);
		return binarySearch(arr, pivot + 1, length - 1, key);

	}

	private static int binarySearch(int[] arr, int index, int length, int key) {
		if (length < index)
			return -1;
		int middle = (index + length) / 2;
		if (arr[middle] == key)
			return middle;
		if (key > arr[middle])
			return binarySearch(arr, middle+1, length, key);

		return binarySearch(arr, index, middle - 1, key);
	}

	private static int findPivot(int[] arr, int index, int length) {

		if (length < index)
			return -1;
		if (index == length)
			return index;

		int middle = (index + (length - 1)) / 2;
		if (middle < length && arr[middle] > arr[middle + 1])
			return middle;
		if (middle > index && arr[middle] < arr[middle - 1])
			return middle - 1;

		if (arr[index] > arr[middle])
			return findPivot(arr, index, middle - 1);

		return findPivot(arr, middle + 1, length);
	}

	public static void main(String[] args) {
		int arr[] = { 6, 7, 8, 1, 2, 3, 4, 5 };
		int key = 6;
		System.out.println("Key is found at index "+ pivotedBinarySearch(arr, arr.length, key));
	}
}
