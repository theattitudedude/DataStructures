package com.DataStructures.Arrays;

public class MaxSumIndexAndArray {

	static int arr[] = { 5, 6, 7, 8,9, 1, 2, 3, 4 };

	private static int findMaxSum() {

		int currentValue = 0, maxvalue = 0, arraySum = 0;
		for (int i = 0; i< arr.length; i++) {
			arraySum = arraySum + arr[i];
			currentValue = currentValue + i * arr[i];
		}
		maxvalue = currentValue;

		for (int j = 1; j < arr.length - 1; j++) {
			currentValue = currentValue + arraySum - arr.length * arr[arr.length - j];
			if (currentValue > maxvalue)
				maxvalue = currentValue;
		}
		return maxvalue;
	}

	public static void main(String[] args) {
		System.out.println("Maximum value of rotated array is: " + findMaxSum());

	}

}
