package com.DataStructures.Arrays;

import java.util.Arrays;

public class MoveNeativeNumbersToRight {

	static int arr[] = { -12, 11, -13, -5, 6, -7, 5, -3, -6 };

	public static int[] positionNegativeElementstoRight(int arr[]) {
		int j = 0, temp;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				if (i != j) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				j++;
			}
		}
		return arr;

	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(positionNegativeElementstoRight(arr)));
	}

}
