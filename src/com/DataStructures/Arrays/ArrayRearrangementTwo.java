package com.DataStructures.Arrays;

import java.util.Arrays;

/*
 * Rearrange array such that arr[i] >= arr[j] if i is even and arr[i]<=arr[j] if i is odd and j < i
 */
public class ArrayRearrangementTwo {

	private static int arr[] = { 1, 8, 3, 6, 7, 9, 10 ,401,201,506};

	private static void arrayRearrangement(int arr[]) {
		int[] temp = arr.clone();

		int evenPlaces = arr.length / 2;
		int oddPlaces = arr.length - evenPlaces;
		int j = oddPlaces - 1;
		Arrays.sort(temp);

		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				arr[i] = addOddPlaces(temp, j);
				j--;

			} else {
				arr[i] = addEvenPlaces(temp, oddPlaces);
				oddPlaces++;
			}
		}
	}

	private static int addEvenPlaces(int[] temp, int oddPlaces) {
		return temp[oddPlaces];
	}

	private static int addOddPlaces(int[] temp, int j) {
		// TODO Auto-generated method stub
		return temp[j];
	}

	public static void main(String[] args) {
		arrayRearrangement(arr);
		System.out.println(Arrays.toString(arr));

	}

}
