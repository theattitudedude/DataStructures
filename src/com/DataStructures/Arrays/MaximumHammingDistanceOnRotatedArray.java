package com.DataStructures.Arrays;

public class MaximumHammingDistanceOnRotatedArray {
	
	private static int arr[] = {1,2,3,4,5,6};
	
	private static int maxHammingDistance(int arr[]) {
		
		int temp[] = new int[arr.length];
		preprocessor(temp, arr);
		int maxHammingDistanceCalculated= 0, hammingDistance ;
		for (int i = 0; i < arr.length ; i++) {
			rotateArray(arr);
			hammingDistance = findHammingDistance(temp, arr);
			maxHammingDistanceCalculated = Math.max(hammingDistance, maxHammingDistanceCalculated);
			if (maxHammingDistanceCalculated == arr.length)
				return maxHammingDistanceCalculated;
		}
		return maxHammingDistanceCalculated;
	}

	private static void preprocessor(int[] temp, int[] arr) {
		for (int i= 0; i < arr.length; i++) {
			temp[i] = arr[i];
		}
		
	}

	private static int findHammingDistance(int[] temp, int[] arr2) {
		int hammingDistance= 0;
		for (int i = 0; i < arr.length; i++) {
			if (temp[i] != arr[i])
				hammingDistance++;
		}
		return hammingDistance;
	}

	private static void rotateArray(int[] arr) {
		int temp = arr[arr.length-1];
		for (int i= arr.length-1; i >0; i--) {
			arr[i] = arr[i-1];
		}
		arr[0] = temp;
	}
	
	private static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
	}

	public static void main(String[] args) {
		System.out.println("Maximum hamming distance is "+ maxHammingDistance(arr));
	}

}
