package com.DataStructures.Arrays;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FIndInArrayUsingPredicate {

	static int target = 1;
	static int arr[] = { 7, 8, 6, 1, 2 };

	public static void main(String[] args) {

		IntPredicate condition = i -> (i != target);
		IntStream stream = Arrays.stream(arr);

		List<Integer> list = stream.filter(condition).boxed().collect(Collectors.toList());

		System.out.println(list);

	}

}
