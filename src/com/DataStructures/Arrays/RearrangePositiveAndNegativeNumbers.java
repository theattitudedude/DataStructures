package com.DataStructures.Arrays;

import java.util.Arrays;

/*
 * Rearrange positive and negative numbers with constant extra space
 */

public class RearrangePositiveAndNegativeNumbers {

	static int arr[] = { 12, 11, -13, -5, 6, -7, 5, -3, -6 };
	
	static void rearrangeArray(int arr[]) {
		int ArrayIterator =0;
		int tempArr[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0)
				tempArr[ArrayIterator++] = arr[i];
		}
		System.out.println("Iterator "+ArrayIterator);
		for(int i = 0 ; i < arr.length;i++) {
			if (!(arr[i] <0)) 
				tempArr[ArrayIterator++] = arr[i];}
		arr= Arrays.copyOf(tempArr, tempArr.length);
			System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		rearrangeArray(arr);
		// TODO Auto-generated method stub

	}

}
