package com.DataStructures.Arrays;

public class IndexDifferenceBetweenMaxAndMinArray {

	static int arr[] = { 80, 81, 10, 3, 2, 34, 30, 33 };

	private static int refinedAlgo(int arr[]) {
		int i = 0, j = arr.length - 1;
		int difference = j - i;
		while (difference != 0) {
			if (arr[i] < arr[i + difference])
				return j - i;
			else if ((i + difference) < arr.length - 1)
				i++;
			else {
				difference--;
				i = 0;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		System.out.println(refinedAlgo(arr));

	}

}
