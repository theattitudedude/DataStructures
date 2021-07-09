package com.DataStructures.Arrays;

public class JugglingAlgoArrayRotation {

	private void arrayRotationAndJuggle(int arr[], int degree) {
		degree = degree % arr.length;
		int i, j, k, temp;
		int GreatestCommonDivisor = GreatestCommonDivisor(degree, arr.length);
		for (i = 0; i < GreatestCommonDivisor; i++) {
			temp = arr[i];
			j = i;
			while (true) {
				k = j + GreatestCommonDivisor;
				if (k >= arr.length)
					k = k - arr.length;
				if (k == i)
					break;
				arr[j] = arr[k];
				j = k;
			}
			arr[j] = temp;
		}
	}

	private int GreatestCommonDivisor(int degree, int length) {
		if (length == 0) 
			return degree;
		else {
			return GreatestCommonDivisor(degree, degree % length);
		}
	}

	void printArray(int arr[]) {
		int i;
		for (i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}

	public static void main(String[] args) {
		int i = 10, j = 5;
		JugglingAlgoArrayRotation arrayRotation = new JugglingAlgoArrayRotation();
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
		arrayRotation.arrayRotationAndJuggle(arr, 3);
		arrayRotation.printArray(arr);
	}
}
