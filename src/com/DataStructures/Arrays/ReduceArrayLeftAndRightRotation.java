package com.DataStructures.Arrays;

import java.util.Optional;

/*
 * Given a sorted array arr[] of the first N Natural Numbers and an integer X, the task is
 *  to print the last remaining element after performing the below operations (N – 1) times:
 *  * If the value of X is 1, then right rotate the array by 1 unit and delete the last element.
 *  * If the value of X is 2, then left rotate the array by 1 unit and delete the first element.
 */

public class ReduceArrayLeftAndRightRotation {

	static int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9,10};
	static int OperationParameter = 2;

	public static int reduceArray(int arr[], int OperationPrameter) {

		int MaxPowerOfTwo = 1, SurvivorElement;

		while (MaxPowerOfTwo < arr.length)
			MaxPowerOfTwo = MaxPowerOfTwo * 2;

		switch (OperationPrameter) {
		
		case 1:
			return SurvivorElement = MaxPowerOfTwo - arr.length;
			
		case 2:
			return SurvivorElement = 2 * (arr.length - MaxPowerOfTwo / 2) + 1;
			
		default:
			return -1;
		}
	}

	public static void main(String[] args) {
		switch (OperationParameter) {
		case 1:
		case 2:
			System.out.println("Last element of reduced array is: " + reduceArray(arr, OperationParameter));
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + OperationParameter);
		}
		
	}

}
