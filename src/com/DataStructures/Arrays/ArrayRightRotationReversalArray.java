package com.DataStructures.Arrays;
/*
 * 
 * 
 * 
 */
public class ArrayRightRotationReversalArray {
	
	static int arr[] = {1,2,3,4,5,6,7,8,9};
	static int RotationFactor = 3;
	
	public static void rotateArray (int arr[], int RotationFactor) {
		reverseArray(arr, 0, arr.length-1);
		reverseArray(arr, 0, RotationFactor - 1);
		reverseArray(arr,RotationFactor , arr.length-1);
	}

	private static void reverseArray(int[] arr, int StartIndex, int EndIndex) {
		int temp;
		while (StartIndex < EndIndex) {
			temp = arr[StartIndex];
			arr[StartIndex] = arr[EndIndex];
			arr[EndIndex] = temp;
			StartIndex++;
			EndIndex--;
		}
	}
	
	private static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
	}


	public static void main(String[] args) {
		rotateArray(arr, RotationFactor);
		printArray(arr);
	}
}
