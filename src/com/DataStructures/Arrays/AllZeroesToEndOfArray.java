package com.DataStructures.Arrays;

import java.util.Arrays;

public class AllZeroesToEndOfArray {

	public static int arr[] = { 1, 2, 0, 4, 3, 0, 5, 0, 0, 0, 1, 11, 13, 0, 0, 9, 0, 0, 8, 9, 7, 6, 5 };

	private static void moveZeroesToEndOfArray(int arr[]) {
		{
			int count = 0; // Count of non-zero elements

			// Traverse the array. If element encountered is
			// non-zero, then replace the element at index 'count'
			// with this element
			for (int i = 0; i < arr.length; i++)
				if (arr[i] != 0)
					arr[count++] = arr[i]; // here count is
											// incremented

			// Now all non-zero elements have been shifted to
			// front and 'count' is set as index of first 0.
			// Make all elements 0 from count to end.
			while (count < arr.length)
				arr[count++] = 0;
		}
	}


	public static void main(String[] args) {
		moveZeroesToEndOfArray(arr);
		System.out.println(Arrays.toString(arr));

	}

}
