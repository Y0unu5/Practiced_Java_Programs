package com.collectionframework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex1 {

	public static void main(String[] args) {
		//find common elements between 2 lists
		List<Integer> numA = new ArrayList<>();
		List<Integer> numB = new ArrayList<>();
		numA.addAll(Arrays.asList(new Integer[] { 1, 3, 64, 5, 6, 75, 33, 55 }));
		numB.addAll(Arrays.asList(new Integer[] { 11, 34, 64, 75, 869, 997, 233, 55 }));
		System.out.println("A: " + numA);
		System.out.println("B: " + numB);
		List<Integer> numC = new ArrayList<>();
		numC.addAll(numA);
		numC.retainAll(numB);

		System.out.println("A: " + numA);
		System.out.println("B: " + numB);
		System.out.println("Common elements between A&B :" + numC);

	}

}
