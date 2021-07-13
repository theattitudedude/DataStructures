package com.DataStructures.Arrays;

import java.util.Arrays;

/*
 * Minimum swaps required to bring all elements less than or equal to k together 
 */
public class SwapArrayToLeftComparingK {

	static int Arr[] = { 2, 1, 5, 6, 3};

	static int Coefficient = 3;

	private static int rearrangeArray(int arr[], int coefficient) {
		int countOfSwappings = 0, arrayIndex, counterIndex = 0;

		for (arrayIndex = 0; arrayIndex < arr.length; arrayIndex++) {
			if ((arr[arrayIndex] < coefficient || arr[arrayIndex] == coefficient) && arrayIndex != counterIndex) {

				swapElementsConditional(arr, arrayIndex, counterIndex, countOfSwappings);
				countOfSwappings++;
				counterIndex++;
			} else if ((arr[arrayIndex] < coefficient || arr[arrayIndex] == coefficient)
					&& arrayIndex == counterIndex) {
				counterIndex++;
			}

		} return countOfSwappings;
	}

	private static void swapElementsConditional(int[] arr, int ArrayIndex, int CounterIndex, int countOfSwappings) {
		int temp = arr[CounterIndex];
		arr[CounterIndex] = arr[ArrayIndex];
		arr[ArrayIndex] = temp;

	}

	public static void main(String[] args) {

		int countOfSwappings = rearrangeArray(Arr, Coefficient);
		System.out.println(Arrays.toString(Arr));
		System.out.println("Swappings happened "+countOfSwappings);
	}

}
