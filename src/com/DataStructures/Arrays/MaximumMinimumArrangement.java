package com.DataStructures.Arrays;

import java.util.Arrays;

public class MaximumMinimumArrangement {
	static int arr[] = { 1, 2, 3, 4, 5, 6, 7, 9, 11 };

	public static int[] arrangeMaxMinArray(int arr[]) {
		int i = 0, startIndex = 0, arrayLengthIndex = arr.length - 1;
		int temp[] = new int[arr.length];
		while (i < arr.length) {
			if (i % 2 == 0)
				temp[i++] = arr[arrayLengthIndex--];
			else
				temp[i++] = arr[startIndex++];
		}
		return arr = Arrays.copyOf(temp, arr.length);
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(arrangeMaxMinArray(arr)));
	}
}