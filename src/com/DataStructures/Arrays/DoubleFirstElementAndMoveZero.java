package com.DataStructures.Arrays;

import java.util.Arrays;

/*
 * For a given array of n integers and assume that ‘0’ is an invalid number and all others as a valid number. 
 * Convert the array in such a way that if both current and next element is valid then double current value 
 * and replace the next number with 0. After the modification, rearrange the array such that all 0’s shifted to the end. 
 */

public class DoubleFirstElementAndMoveZero {

	static int arr[] = { 2, 2, 0, 4, 0, 8, 2, 3 };

	public static void OperateOnArray(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != 0 && arr[i + 1] != 0) {
				arr[i] *= arr[i];
				arr[i + 1] = 0;
			}
		}
		moveZeroesToRight(arr);
	}

	public static void moveZeroesToRight(int arr[]) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0)
				arr[count++] = arr[i];
		}
		while (count < arr.length) {
			arr[count++] = 0;
		}
	}

	public static void main(String[] args) {
		OperateOnArray(arr);
		System.out.println(Arrays.toString(arr));

	}

}
