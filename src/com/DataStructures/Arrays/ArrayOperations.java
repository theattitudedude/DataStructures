package com.DataStructures.Arrays;

/*
 *This java class operates on an array based on the following input:
 * 1 x : Right Circular Shift the array x times. If an array is a[0], a[1], …., a[n – 1], then after one right circular shift the array will become a[n – 1], a[0], a[1], …., a[n – 2]. 
 * 2 y : Left Circular Shift the array y times. If an array is a[0], a[1], …., a[n – 1], then after one left circular shift the array will become a[1], …., a[n – 2], a[n – 1], a[0]. 
 * 3 l r : Print the sum of all integers in the subarray a[l…r] (l and r inclusive). 
 */

public class ArrayOperations {

	private static int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };

	public static void main(String[] args) {

		operateOnArray(arr, 1, 2);
		printArray(arr);
		operateOnArray(arr, 2, 2);
		printArray(arr);
		System.out.println(operateOnArray(arr, 4, 0, 2));
	}
	
	//print array
	private static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
		System.out.println();
	}

	private static String operateOnArray(int[] arr, int Operation, int StartingIndex, int EndingIndex) {
		int sum = 0;
		switch (Operation) {
		case 3:
			
			for (int i = StartingIndex; i <= EndingIndex; i++)
				sum = sum + arr[i];
			return "Sum of array indexed at "+StartingIndex+ " and "+EndingIndex+" is "+ sum;
		default:
			return "Illegal Operation Paramer "+ Operation;
			
		}
	}

	private static void operateOnArray(int[] arr, int Operation, int degree) {
		switch (Operation) {
		case 1:
			for (int i = 0; i < degree; i ++) 
				rightRotateArray(arr);
			break;
		case 2:
			for (int i = 0; i < degree; i ++) 
				leftRotateArray(arr);
			break;
			
		}

	}

	private static void rightRotateArray(int[] arr) {
		int temp = arr[arr.length-1];
		for (int i=arr.length-1; i>0; i--)
			arr[i] = arr[i-1];
		arr[0] = temp;
	}

	private static void leftRotateArray(int[] arr) {
		int temp = arr[0];
		for (int i = 0; i < arr.length-1; i++)
			arr[i] = arr[i+1];
		arr[arr.length-1] = temp;
	}
}
