package com.DataStructures.Arrays;

/*
*Find element at given index after a number of rotations
*
*Input : array[] : {1, 2, 3, 4, 5}
        ranges[] = { {0, 2}, {0, 3} }
        index : 1
 Output : 3
*/
public class FindElementAfterNRotations {
	static int arr[] = { 1, 2, 3, 4, 5 };
	static int ranges[][] = { { 0, 2 }, { 0, 3 } };
	static int index = 2;

	public static int findIndexAfterRotations(int[] arr, int ranges[][], int index) {

		int rotations = ranges.length;

		for (int i = rotations - 1; i >= 0; i--) {
			int leftIndex = ranges[i][0];
			int rightIndex = ranges[i][1];

			if (leftIndex <= index && rightIndex >= index)
				if (index == leftIndex)
					index = rightIndex;
				else
					index--;
		}
		return arr[index];
	}

	public static void main(String[] args) {
		System.out.println(findIndexAfterRotations(arr, ranges, index));

	}

}
