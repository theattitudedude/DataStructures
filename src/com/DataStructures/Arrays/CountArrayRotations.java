package com.DataStructures.Arrays;

public class CountArrayRotations {

	private static int arr[] = { 5, 6, 7, 1, 2, 3, 4 };
	
	private static int findRotations(int arr[]) {
		int i;
		for (i = 0; i < arr.length-1; i++) {
			if (arr[i] > arr[i+1])
				return i;
			}
		return -1;
	}

	public static void main(String[] args) {
		System.out.println("Array is rorated "+ (findRotations(arr)+1) + " times");
	}
}