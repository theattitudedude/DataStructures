package com.DataStructures.Arrays;

public class MaxSumIndexAndArray2 {

	static int arr[] = { 5, 6, 7, 8, 9, 1, 2, 3, 4 };

	private static int maxSum(int arr[]) {

		int pivot = findPivot(arr);
		int diff = arr.length - 1 - pivot ;
		int sum = 0;
		for (int i = 0; i < arr.length ; i++)
			sum = sum +((i+diff)%arr.length)*arr[i];
		return sum;
	}

	private static int findPivot(int arr[]) {
		int pivot;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1])
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		
		System.out.println("Max sum of array is: "+maxSum(arr));

	}

}
