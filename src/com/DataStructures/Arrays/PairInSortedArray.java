package com.DataStructures.Arrays;

public class PairInSortedArray {

	public static void main(String[] args) {
		int arr[] = { 11, 15, 6, 7, 9, 10 };
		int sum = 16;
		int n = arr.length;

		System.out.println(pairsInSortedRotated(arr, n, sum));
	}

	private static int pairsInSortedRotated(int[] arr, int arraySize, int sum) {
		int matchCount = 0;
		int largestNumberIndex = findPivot(arr);
		if (largestNumberIndex < 0)
			;
		// handle the condition here
		int smallestNumberIndex = (largestNumberIndex + 1) % arraySize;

		while (smallestNumberIndex != largestNumberIndex) {
			if (arr[smallestNumberIndex] + arr[largestNumberIndex] == sum) {
				matchCount++;
				if (smallestNumberIndex == (largestNumberIndex - 1 + arraySize) % arraySize)
					return matchCount;
				smallestNumberIndex = (smallestNumberIndex + 1) % arraySize;
				largestNumberIndex = (largestNumberIndex - 1 + arraySize) % arraySize;
			}

			else if (arr[smallestNumberIndex] + arr[largestNumberIndex] < sum)
				smallestNumberIndex = (smallestNumberIndex + 1) % arraySize;
			else
				largestNumberIndex = (arraySize + largestNumberIndex - 1) % arraySize;

		}

		return matchCount;
	}

	private static int findPivot(int[] arr) {
		int i ;
		for (i = 0; i < arr.length - 1; i++) 
			if (arr[i] > arr[i + 1])
				return i;
		return i;
	}
}
