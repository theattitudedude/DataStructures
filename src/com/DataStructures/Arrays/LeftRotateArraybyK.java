package com.DataStructures.Arrays;

public class LeftRotateArraybyK {

	private static int arr[] = { 1, 2, 3, 4, 5, 6 };
	private static int RotationFactor = 3;

	private static void rotateArray(int arr[], int RotationFactor) {
		int temp = 0, i;
		for (i = RotationFactor; i < arr.length +RotationFactor; i++) 
			System.out.print(arr[i%arr.length]+ " "); 
	}
//	another way to implement the same is to concatenate same arrays and start printing taking the rotationfactor as index.

	public static void main(String[] args) {
		rotateArray(arr, RotationFactor);
	}
}
