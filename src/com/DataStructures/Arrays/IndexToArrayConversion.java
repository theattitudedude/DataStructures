package com.DataStructures.Arrays;

import java.util.Arrays;

public class IndexToArrayConversion {
	
	static int arr[] = {1, 3, 0, 2};
	
	static void arrayConversion(int arr[]) {
		int tempArr[] = new int[arr.length], temp;
		for (int i = 0; i < arr.length; i ++) {
			temp = arr[i];
			tempArr[temp]= i;
		}
		arr = Arrays.copyOf(tempArr, tempArr.length);
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		arrayConversion(arr);
	}
}
